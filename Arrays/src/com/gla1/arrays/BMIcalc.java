import java.util.Scanner;
class BMIcalc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double data[][]=new double[n][3];
        String st[]=new String[n];

        for(int i=0;i<n;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            if(w<=0||h<=0){
                i--;
                continue;
            }
            data[i][0]=w;
            data[i][1]=h;
        }

        for(int i=0;i<n;i++){
            data[i][2]=data[i][0]/(data[i][1]*data[i][1]);
            double b=data[i][2];
            if(b<18.5) st[i]="Underweight";
            else if(b<25) st[i]="Normal";
            else if(b<30) st[i]="Overweight";
            else st[i]="Obese";

            System.out.println(data[i][1]+" "+data[i][0]+" "+data[i][2]+" "+st[i]);
        }
    }
}
