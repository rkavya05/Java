import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value1 : ");
        int value1= sc.nextInt();
         System.out.print("Enter the value2 : ");
        int value2 = sc.nextInt();
         System.out.print("Enter the value3 : ");
        int value3 = sc.nextInt();
        int SumOfTriangle = value1+value2+value3;
        if (SumOfTriangle==180){
            System.out.println("Triangle can be formed");
        }
        else
        {
            System.out.println("Triangle cannot be formed");
        }
    }
}
