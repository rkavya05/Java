//https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
class prime {
   public static void main(String[] args){
    int n=100;
    int [] a=new int[n+1];
    for (int i = 2; i <=n; i++) {
      a[i] = 1;
   }
      for(int i=2;i*i<=n;i++)
      {
          if(a[i]==1)
          {
            for(int j=i*i;j<=n;j=j+i)
            {
               a[j]=0;
            }
          }
      }
      for(int i=2;i<=n;i++){
         if(a[i]==1){
            System.out.print(i+" ");
         }
      }
   } 
}
