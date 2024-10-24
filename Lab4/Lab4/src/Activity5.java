import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a decimal number between 0 and 255:");
		int Number = scan.nextInt();
		if (0 > Number || 255 < Number) {
			System.out.println("enter the correct value:");
			Number = scan.nextInt();
		}
		System.out.print(Number + " in binary = ");
		binaryValue(Number);

	}

	public static void binaryValue(int i) {
    int binary=0,count=0;
		while(i != 0) {
			int mod=i % 2;
		    binary= (int) (binary + mod*Math.pow(10,count));
			i/=2;
			count++;
			
		}
		System.out.println(binary);
	}
}