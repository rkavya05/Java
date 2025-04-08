class sum{
    int n;
    public int sum(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
}
public class Main{
    public static void main(String a[]){
        sum obj= new sum();
        int result=obj.sum(3);
        System.out.print(result);
    }
}
