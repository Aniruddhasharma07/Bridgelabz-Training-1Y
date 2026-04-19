import java.util.Scanner;
class Marks2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mk[][]=new int[n][3];
        double pr[]=new double[n];
        char gr[]=new char[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                mk[i][j]=sc.nextInt();
                if(mk[i][j]<0){
                    j--;
                }
            }
        }

        for(int i=0;i<n;i++){
            pr[i]=(mk[i][0]+mk[i][1]+mk[i][2])/3.0;
            if(pr[i]>=90) gr[i]='A';
            else if(pr[i]>=75) gr[i]='B';
            else if(pr[i]>=60) gr[i]='C';
            else gr[i]='D';
            System.out.println(pr[i]+" "+gr[i]);
        }
    }
}
