import java.util.*;
public class activity3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number?");
		int n,a,b;
		n=input.nextInt();
		a=n%10;
		b=n/100;
		
		if(a==b) {
			System.out.println(n +""+ " is a palindrome");
		}
		else 
			System.out.println(n +""+ " is not a palindrome");
			

	}

}
