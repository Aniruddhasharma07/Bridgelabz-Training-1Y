import java.util.Scanner;
class FizzBuzzArray{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<=0){
            return;
        }
        String[] arr=new String[n+1];
        for(int i=0;i<=n;i++){
            if(i%3==0&&i%5==0){
                arr[i]="FizzBuzz";
            }else if(i%3==0){
                arr[i]="Fizz";
            }else if(i%5==0){
                arr[i]="Buzz";
            }else{
                arr[i]=i+"";
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("Position "+i+" = "+arr[i]);
        }
    }
}
