import java.util.Scanner;
class Multi{
          public static void main(String args[]){

	       Scanner sc = new Scanner (System.in);
               System.out.println("Enter the first number =");
	       int p = sc.nextInt();

		
		System.out.println("Enter the second number =");
                int q = sc.nextInt();
	
		int multiflication = p*q;

                System.out.println("Multiflication of two number is =" + multiflication);
}
}