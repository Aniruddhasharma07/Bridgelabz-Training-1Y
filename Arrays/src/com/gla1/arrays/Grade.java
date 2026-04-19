import java.util.Scanner;
class Grade{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int[] phy=new int[n];
int[] chem=new int[n];
int[] math=new int[n];
double[] percent=new double[n];
char[] grade=new char[n];

for(int i=0;i<n;i++){
phy[i]=sc.nextInt();
chem[i]=sc.nextInt();
math[i]=sc.nextInt();
if(phy[i]<0||chem[i]<0||math[i]<0){i--;}
}

for(int i=0;i<n;i++){
percent[i]=(phy[i]+chem[i]+math[i])/3.0;
if(percent[i]>=80)grade[i]='A';
else if(percent[i]>=70)grade[i]='B';
else if(percent[i]>=60)grade[i]='C';
else if(percent[i]>=50)grade[i]='D';
else if(percent[i]>=40)grade[i]='E';
else grade[i]='R';
}

for(int i=0;i<n;i++){
System.out.println(phy[i]+" "+chem[i]+" "+math[i]+" "+percent[i]+" "+grade[i]);
}
}
}
