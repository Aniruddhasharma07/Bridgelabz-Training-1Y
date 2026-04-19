import java.util.Scanner;
class VoteCheck{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<ages.length;i++){
            ages[i]=in.nextInt();
        }
        for(int a:ages){
            if(a<0){
                System.out.println("Invalid age");
            }else if(a>=18){
                System.out.println("The student with the age "+a+" can vote");
            }else{
                System.out.println("The student with the age "+a+" cannot vote");
            }
        }
    }
}
