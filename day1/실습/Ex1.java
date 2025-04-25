package day1.실습;

public class Ex1 {
	public static int findIndex(String[] arr, String str) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(str)) {
				return i;
			}
		}
		return 0;
	}
	
	public static <T> int findIndex2(T[] arr, T j) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(j)) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
		System.out.println(Ex1.findIndex(strings, "orange"));
		
		Integer[] nums = {1,5,2,3,5,67,7,23};
		Character[] chars = {'a','b','v','g','q','j','k'};
		System.out.println(Ex1.<Integer>findIndex2(nums, 67));
		System.out.println(Ex1.findIndex2(strings, "orange"));
		System.out.println(Ex1.<Character>findIndex2(chars, 'v'));
	}
}
