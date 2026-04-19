import java.util.Scanner;
class MeanHeight{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double[] h=new double[11];
        double total=0;
        for(int i=0;i<h.length;i++){
            h[i]=in.nextDouble();
            total+=h[i];
        }
        System.out.println(total/h.length);
    }
}
