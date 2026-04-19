import java.util.Scanner;
class ReverseArr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,tmp=n;

        while(tmp!=0){
            c++;
            tmp/=10;
        }

        int a[]=new int[c];
        for(int i=0;i<c;i++){
            a[i]=n%10;
            n/=10;
        }

        for(int i=0;i<c;i++)
            System.out.print(a[i]);
    }
}
