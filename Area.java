import java.util.Scanner;
class Area{
          public static void main(String args[]){

	       Scanner sc = new Scanner (System.in);
               System.out.println("Enter the Radius of circle  =");
	       int radius = sc.nextInt();
		
		double area;
		area = 3.14 * radius * radius;
		System.out.println("Area of circle is =" + area);
}
}
