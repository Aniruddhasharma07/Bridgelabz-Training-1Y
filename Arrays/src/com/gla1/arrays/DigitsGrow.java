import java.util.Scanner;
class DigitsGrow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=10;
        int arr[]=new int[size];
        int idx=0;

        while(n!=0){
            if(idx==size){
                size+=10;
                int t[]=new int[size];
                for(int i=0;i<idx;i++){
                    t[i]=arr[i];
                }
                arr=t;
            }
            arr[idx++]=n%10;
            n/=10;
        }

        int big=0,sec=0;
        for(int i=0;i<idx;i++){
            if(arr[i]>big){
                sec=big;
                big=arr[i];
            }else if(arr[i]>sec&&arr[i]!=big){
                sec=arr[i];
            }
        }

        System.out.println(big);
        System.out.println(sec);
    }
}
