import java.util.Scanner;
class Swap{
          public static void main(String args[]){

	       Scanner sc = new Scanner (System.in);
               System.out.println("Enter the first number =");
	       int a = sc.nextInt();
		System.out.println("Enter the second number =");
                int b = sc.nextInt();

System.out.println("Before Swap a =" +a);
System.out.println("Before swap b ="+ b);

		b=b-a;  
                a=b+a;	
System.out.println("After swap a =" + a);

System.out.println("After swap b =" + b);

}
}