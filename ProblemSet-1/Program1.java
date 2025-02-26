import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("Enter the input of a integer, String, Char");
        Scanner sc=new Scanner(System.in);
        int integer = sc.nextInt();
        System.out.println(integer);
        String str = sc.next(); 
        System.out.println(str);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}

OUTPUT :
Enter the input of a integer, String, Char
2 Name y
2
Name
y

