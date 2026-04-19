package com.gla.string;
import java.util.*;
public class TeamBMICalculator{
static String[][] bmiData(double[][]a){
String[][]r=new String[10][4];
for(int i=0;i<10;i++){
double h=a[i][1]/100.0;
double bmi=a[i][0]/(h*h);
String s="";
if(bmi<18.5)s="Underweight";
else if(bmi<25)s="Normal";
else if(bmi<40)s="Overweight";
else s="Obese";
r[i][0]=String.valueOf(a[i][1]);
r[i][1]=String.valueOf(a[i][0]);
r[i][2]=String.valueOf(Math.round(bmi*100)/100.0);
r[i][3]=s;
}
return r;
}
static void display(String[][]a){
System.out.println("Height Weight BMI Status");
for(int i=0;i<10;i
