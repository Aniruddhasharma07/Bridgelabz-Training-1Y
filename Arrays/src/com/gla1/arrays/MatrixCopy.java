import java.util.Scanner;
class MatrixCopy{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=in.nextInt();
            }
        }
        int[] flat=new int[r*c];
        int k=0;
        for(int[] row:m){
            for(int v:row){
                flat[k++]=v;
            }
        }
        for(int x:flat){
            System.out.print(x+" ");
        }
    }
}
