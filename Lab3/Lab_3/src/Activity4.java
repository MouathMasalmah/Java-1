import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i,n,b;
		System.out.println("Enter the maximum value for i?");
		n=input.nextInt();
		double a;
		for(i=1;i<=n;i++) {
			a=4*Math.pow(-1,i+1);
			b=(2*i-1);
			System.out.println(a+"/"+b);
		}

	}

}
