class Palindrome {
    public static void main(String[] args) {
      int n = 52425 ;
      int temp = n;
      int sum=0;
      while(n>0){
          int Lastdigit = n%10;
          sum = sum*10+Lastdigit;
          n=n/10;
      }
      if(temp==sum){
          System.out.print("True");
      }
      else{
          System.out.print("False");
      }
    }
}
