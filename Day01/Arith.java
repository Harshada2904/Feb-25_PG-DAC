import java.util.Scanner;
class Arith{
          public static void main(String args[]){

	       Scanner sc = new Scanner (System.in);
               System.out.println(" Input first number =");
	       int x = sc.nextInt();

		
		System.out.println("Input second number =");
                int y = sc.nextInt();
	
		int add = x+y;
		int sub = x-y;
		int multi = x*y;
		int div = x/y;
		int mod = x%y;

		System.out.println("Addition of two number is =" + add);
		System.out.println("Substraction of two number is =" + sub);
                System.out.println("Multiflication of two number is =" + multi);
		System.out.println("Division of two number is =" + div);
                System.out.println("Modules of two number is =" + mod);
}
}