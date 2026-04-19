import java.util.Scanner;
class DigitsCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=10;
        int d[]=new int[max];
        int k=0;

        while(n!=0){
            if(k==max) break;
            d[k++]=n%10;
            n=n/10;
        }

        int l=0,s=0;
        for(int i=0;i<k;i++){
            if(d[i]>l){
                s=l;
                l=d[i];
            }else if(d[i]>s&&d[i]!=l){
                s=d[i];
            }
        }

        System.out.println(l);
        System.out.println(s);
    }
}
