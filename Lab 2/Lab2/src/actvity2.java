import java.util.*;
public class actvity2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number?");
		a=input.nextInt();
		System.out.println("Enter the secound number?");
		b=input.nextInt();
		System.out.println("Enter the third number?");
		c=input.nextInt();
		if(a>b && a>c && b>c) {
			System.out.println(a +" "+ b +" "+ c);
		}
		else if(a>b && a>c && c>b) {
			System.out.println(a +" "+ c +" "+ b);
		}
		else if(b>a && b>c && a>c) {
			System.out.println(b +" "+ a +" "+ c);
		}
		else if(b>a && b>c && c>a) {
			System.out.println(b +" "+ b +" "+ a);
		}
		else if(c>a && c>b && a>b) {
			System.out.println(c +" "+ a +" "+ b);
		}
		else if(c>a && c>b && b>a) {
			System.out.println(c +" "+ b +" "+ a);
		}
	}
}
