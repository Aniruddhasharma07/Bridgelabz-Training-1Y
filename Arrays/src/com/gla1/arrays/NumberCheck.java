import java.util.Scanner;
class NumberCheck{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        for(int n:nums){
            if(n>0){
                System.out.println(n%2==0?"Positive Even":"Positive Odd");
            }else if(n<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
        if(nums[0]==nums[4]){
            System.out.println("Equal");
        }else if(nums[0]>nums[4]){
            System.out.println("Greater");
        }else{
            System.out.println("Less");
        }
    }
}
