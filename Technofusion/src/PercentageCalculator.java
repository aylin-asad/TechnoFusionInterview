import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please input a string: ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		int total = input.length();
		
		int numOfUpper = 0;
		int numOfLower = 0;
		int numOfDigits = 0;
		int numOfOthers = 0;
		
		
		for(int i = 0; i < total; i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				numOfUpper++;
			}
			else  if(Character.isLowerCase(input.charAt(i))) {
				numOfLower++;
			}
			else if(Character.isDigit(input.charAt(i))) {
				numOfDigits++;
			}
			else {
				numOfOthers++;
			}
		}
		
		System.out.println("Number of uppercase letters is " + numOfUpper + ". So percentage is " + Math.round( (((numOfUpper*1.0)/(total*1.0))*100)* 100.0) / 100.0 + "%");
		System.out.println("Number of lowercase letters is " + numOfLower + ". So percentage is " + Math.round( (((numOfLower*1.0)/(total*1.0))*100)* 100.0) / 100.0 + "%");
		System.out.println("Number of digits is " + numOfDigits + ". So percentage is " + Math.round( (((numOfDigits*1.0)/(total*1.0))*100)* 100.0) / 100.0 + "%");
		System.out.println("Number of other characters is " + numOfOthers + ". So percentage is " + Math.round( (((numOfOthers*1.0)/(total*1.0))*100)* 100.0) / 100.0 + "%");
		

	}

}
