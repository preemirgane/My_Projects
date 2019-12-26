package Test;
import java.util.Scanner;

public class Factorial_Program {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num=sc.nextInt();

			int fact=1;
			for(int i=num;i>=1;i--)
			{
				 fact=fact*i;
				 if(i>1)
				 System.out.print(i+"*");
				 else 
					 System.out.print(i);
			}
			System.out.print(" = "+fact);
		}

	

}
