import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the mark of a student : ");
        Scanner sc= new Scanner(System.in);
        int Mark = sc.nextInt();
        if(Mark>=90){
            System.out.println("Grade A");
        }
         else if(Mark>=80){
            System.out.println("Grade B");
        }
         else if(Mark>=60){
            System.out.println("Grade C");
        }
         else if(Mark>=35){
            System.out.println("Grade D");
        }
         else{
            System.out.println("Fail");
        }
    }
}
