import java.util.*;
public class Actvity3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1,num2,b;
		System.out.println("Enter the first number");
		num1=input.nextInt();
		System.out.println("Enter the secound number");
		num2=input.nextInt();
		b=Math.min(num1,num2);
			while(b != 0){
			if(num2%b==0 && num1%b==0){
			System.out.println("the Result="+b);
			break;
			        }
			b=b-1;
			}
		          
	   }
}


