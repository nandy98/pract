package javaPractice1;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,0,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}

}
