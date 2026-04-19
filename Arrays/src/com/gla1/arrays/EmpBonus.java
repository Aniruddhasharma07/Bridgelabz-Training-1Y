import java.util.Scanner;
class EmpBonus{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double sal[]=new double[10];
        double yrs[]=new double[10];
        double bon[]=new double[10];
        double ns[]=new double[10];
        double tb=0,os=0,nsum=0;

        for(int i=0;i<10;i++){
            double a=s.nextDouble();
            double b=s.nextDouble();
            if(a<=0||b<0){
                i--;
                continue;
            }
            sal[i]=a;
            yrs[i]=b;
        }

        int i=0;
        while(i<10){
            if(yrs[i]>5)
                bon[i]=sal[i]*0.05;
            else
                bon[i]=sal[i]*0.02;

            ns[i]=sal[i]+bon[i];
            tb+=bon[i];
            os+=sal[i];
            nsum+=ns[i];
            i++;
        }

        System.out.println(tb);
        System.out.println(os);
        System.out.println(nsum);
    }
}
