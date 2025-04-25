package day1prac.정렬;

public class 정렬하기 {
	public static void main(String[] args) {
		//선택정렬
		//int[] arr = new int[5];
		//int[] arr = {10,5,7,1,13};
		int[] arr = null;
		arr = new int[] {10,5,7,1,13};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		//정렬 후
		System.out.print("정렬 후 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
