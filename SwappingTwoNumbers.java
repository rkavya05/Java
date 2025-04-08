//Swapping two numbers
import java.util.Scanner;
class SwappingTwoNumbers
{
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping: "+a+" "+b);
        //using third variable
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping: "+a+" "+b);
	}
}
