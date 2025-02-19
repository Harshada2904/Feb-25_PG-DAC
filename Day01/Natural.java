import java.util.Scanner;
class Natural{
          public static void main(String args[]){

	       Scanner sc = new Scanner (System.in);
               System.out.println("Enter the number =");
	       int num = sc.nextInt();
		System.out.println("Print the first N natural numbers ");

	       for(int i=1;i<=num;i++)
			{
				System.out.println(i);
			}
		
}
}
