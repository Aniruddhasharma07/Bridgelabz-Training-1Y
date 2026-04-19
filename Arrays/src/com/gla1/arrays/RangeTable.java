import java.util.Scanner;
class RangeTable{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] out=new int[4];
        for(int i=6;i<=9;i++){
            out[i-6]=n*i;
        }
        for(int i=6;i<=9;i++){
            System.out.println(n+" * "+i+" = "+out[i-6]);
        }
    }
}
