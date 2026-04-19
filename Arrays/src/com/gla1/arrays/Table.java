import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] res=new int[10];
        int i=1;
        while(i<=10){
            res[i-1]=n*i;
            i++;
        }
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+res[i-1]);
        }
    }
}
