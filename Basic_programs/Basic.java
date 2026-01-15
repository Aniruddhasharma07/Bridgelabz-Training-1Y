import java.util.Scanner;
class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a= sc.nextDouble();
        System.out.print("Enter second number: ");
        double b= sc.nextDouble();
        double aa= a+b;
        double s=a-b;
        double m=a*b;
        double d=a/b;
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + a + " and " + b + " is "
            + aa + ", " + s + ", " + m + ", and " + d
        );

        sc.close();
    }
}
