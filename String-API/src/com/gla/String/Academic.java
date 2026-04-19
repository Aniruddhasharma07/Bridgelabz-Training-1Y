package com.gla.string;
import java.util.*;
public class Academic{
static int[][] scores(int n){
int[][] a=new int[n][3];
for(int i=0;i<n;i++)
for(int j=0;j<3;j++)
a[i][j]=10+(int)(Math.random()*90);
return a;
}
static double[][] calc(int[][]a){
double[][] r=new double[a.length][3];
for(int i=0;i<a.length;i++){
int t=a[i][0]+a[i][1]+a[i][2];
double avg=t/3.0;
double per=(t/300.0)*100;
r[i][0]=t;
r[i][1]=Math.round(avg*100)/100.0;
r[i][2]=Math.round(per*100)/100.0;
}
return r;
}
static String grade(double p){
if(p>=80)return"A";
if(p>=70)return"B";
if(p>=60)return"C";
if(p>=50)return"D";
if(p>=40)return"E";
return"R";
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] s=scores(n);
double[][] r=calc(s);
for(int i=0;i<n;i++)
System.out.println(s[i][0]+" "+s[i][1]+" "+s[i][2]+" "+r[i][0]+" "+r[i][1]+" "+r[i][2]+" "+grade(r[i][2]));
}
}
