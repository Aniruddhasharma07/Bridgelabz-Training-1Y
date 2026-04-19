import java.util.Scanner;
class StoreSum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double[] data=new double[10];
        double sum=0;
        int pos=0;
        while(true){
            double v=in.nextDouble();
            if(v<=0||pos==10){
                break;
            }
            data[pos++]=v;
        }
        for(int i=0;i<pos;i++){
            sum+=data[i];
        }
        System.out.println(sum);
    }
}
