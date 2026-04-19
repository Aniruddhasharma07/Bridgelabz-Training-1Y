package com.gla.string;
import java.util.*;
public class MaxOfThreeNumbers{
static int[] input(Scanner sc){
int[]a=new int[3];
for(int i=0;i<3;i++)a[i]=sc.nextInt();
return a;
}
static int max(int a,int b,int c){
int m=a;
if(b>m)m=b;
if(c>m)m=c;
return m;
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
int[]a=input(sc);
System.out.println(max(a[0],a[1],a[2]));
}
}
