import java.util.Scanner;
class FriendsCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        double h[]=new double[3];

        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
            h[i]=sc.nextDouble();
        }

        int young=a[0];
        double tall=h[0];

        for(int i=1;i<a.length;i++){
            if(a[i]<young)
                young=a[i];
            if(h[i]>tall)
                tall=h[i];
        }

        System.out.println(young);
        System.out.println(tall);
    }
}
