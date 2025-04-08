class printn{
    int a;
void printn(int a){
    if(a==0){
        return;
    }
    else{
        System.out.println(a);
        printn(a-1);
    }
}
}
class Main{
    public static void main(String[] args){
        printn obj=new printn();
        obj.printn(5);
    }
}

//5 4 3 2 1
