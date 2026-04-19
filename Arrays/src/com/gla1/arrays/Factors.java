import java.util.Scanner;
class Factors{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int size=10;
        int[] f=new int[size];
        int idx=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(idx==size){
                    size*=2;
                    int[] temp=new int[size];
                    for(int j=0;j<idx;j++){
                        temp[j]=f[j];
                    }
                    f=temp;
                }
                f[idx++]=i;
            }
        }
        for(int i=0;i<idx;i++){
            System.out.print(f[i]+" ");
        }
    }
}
