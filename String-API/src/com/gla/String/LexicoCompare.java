import java.util.*;
public class LexicoCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int len = Math.min(s1.length(), s2.length());
        int flag = 0;

        for(int i=0;i<len;i++){
            if(s1.charAt(i) < s2.charAt(i)){ flag=-1; break; }
            else if(s1.charAt(i) > s2.charAt(i)){ flag=1; break; }
        }

        if(flag==0)
            flag = s1.length() - s2.length();

        if(flag<0)
            System.out.println(s1+" comes before "+s2);
        else if(flag>0)
            System.out.println(s1+" comes after "+s2);
        else
            System.out.println("Both are equal");
    }
}
