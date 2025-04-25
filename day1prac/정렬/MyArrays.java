package day1prac.정렬;

public class MyArrays {
	public static void sort(Object[] arr, MyComparator c) {
		//선택정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i],arr[j])>0) { //양수이면 두 개를 교환한다
					Object tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	// MyComparable
	public static void sort(Object[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				//if()
				MyComparable obj = (MyComparable)arr[i];
				if(obj.compareTo(arr[j])>0) {
					//두 개의 요소를 교환하겠어
					Object temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
