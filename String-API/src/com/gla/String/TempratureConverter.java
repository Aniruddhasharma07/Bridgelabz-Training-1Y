package com.gla.string;
import java.util.*;
public class TemperatureConverter{
static double fToC(double f){
return (f-32)*5/9;
}
static double cToF(double c){
return (c*9/5)+32;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
double t=sc.nextDouble();
if(ch==1)System.out.println(fToC(t));
else if(ch==2)System.out.println(cToF(t));
}
}
