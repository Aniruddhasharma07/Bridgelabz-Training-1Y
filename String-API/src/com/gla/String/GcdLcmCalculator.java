package com.gla.string;
import java.util.*;
public class GcdLcmCalculator{
static int gcd(int a,int b){
while(b!=0){
int t=b;
b=a%b;
a=t;
}
return a;
}
static int lcm(int a,int b){
return (a*b)/gcd(a,b);
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("GCD: "+gcd(a,b));
System.out.println("LCM: "+lcm(a,b));
}
}
