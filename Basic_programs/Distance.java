import java.util.Scanner;
class Distance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println(
            "The distance of " + distanceInFeet +
            " feet is equal to " + distanceInYards +
            " yards and " + distanceInMiles +
            " miles."
        );
        sc.close();
    }
}
