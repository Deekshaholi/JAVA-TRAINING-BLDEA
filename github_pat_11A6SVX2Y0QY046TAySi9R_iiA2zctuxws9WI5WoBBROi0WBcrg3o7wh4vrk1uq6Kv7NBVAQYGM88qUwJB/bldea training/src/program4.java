import java.util.Scanner;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();

		if(age<18) {
			System.out.println("You are a minor");
		}
		else if(age>65) {
			System.out.println("You are old");
		}
		else {
			System.out.println("You are a groom");
		}
	}
}
