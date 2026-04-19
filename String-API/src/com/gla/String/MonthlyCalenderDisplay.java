package com.gla.string;
import java.util.*;
public class MonthlyCalendarDisplay{
static boolean leap(int y){
return(y%400==0||(y%4==0&&y%100!=0));
}
static int days(int m,int y){
int[]d={31,28,31,30,31,30,31,31,30,31,30,31};
if(m==2&&leap(y))return 29;
return d[m-1];
}
static int first(int m,int y){
int y0=y-(14-m)/12;
int x=y0+y0/4-y0/100+y0/400;
int m0=m+12*((14-m)/12)-2;
return(1+x+31*m0/12)%7;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt(),y=sc.nextInt();
String[]mon={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
System.out.println(mon[m-1]+" "+y);
System.out.println("Sun Mon Tue Wed Thu Fri Sat");
int f=first(m,y),d=days(m,y);
for(int i=0;i<f;i++)System.out.print("    ");
for(int i=1;i<=d;i++){
System.out.printf("%4d",i);
if((i+f)%7==0)System.out.println();
}
}
}
