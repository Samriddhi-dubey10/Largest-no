package practical3;
import java.util.Scanner;


public class print {
public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter any 3 integer: ");
	Scanner obj = new Scanner(System.in);
	a=obj.nextInt();
	b= obj.nextInt();
	c=obj.nextInt();
	if(a>=b && a>=c)
	{
		System.out.println("The largest number is " +a);
	}
	else if (b>=a && b>=c) {
		System.out.println("The largest no is " +b);
	}
	else if(c>=a && c>=b) {
		System.out.println("The largest no is " +c);
	}
	else
	{
		System.out.println("All are equal");
	}
	
}

}
