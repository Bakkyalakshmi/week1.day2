package week1.day2;

public class Amstrong {

	public static void main(String[] args) {
		int input = 153;
		int calculated=0;
		int original = input;
		while (input>0) {
			int remind = input%10;
			calculated = calculated + (remind*remind*remind);
			input = input/10;
		}
			if (calculated==original) {
				System.out.println("Is a Amstrong Number");
			} else {
				System.out.println("Not a Amstrong");
			}
		}
		 

	}
