
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,3,6,6,8,9,10,10,10,12,12};
		int n = arr.length;
		
		int[] temp = new int[n];  
		
		int index = 0;
		
		temp[index] = arr[index];
		for(int i = 1; i < n; i++) {
			if(temp[index] != arr[i]) {
				index++;
				temp[index] = arr[i];
			}
		}
		
		for(int i = 0; i <= index; i++)
			System.out.print(temp[i] + " ");

	}

}
