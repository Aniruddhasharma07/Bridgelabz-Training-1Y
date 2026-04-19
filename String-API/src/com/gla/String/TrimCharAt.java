package com.gla.string;
import java.util.*;
public class TrimCharAt{
static int[] trimIndex(String s){
int st=0,en=s.length()-1;
while(st<s.length()&&s.charAt(st)==' ')st++;
while(en>=0&&s.charAt(en)==' ')en--;
return new int[]{st,en};
}
static String sub(String s,int st,int en){
String t="";
for(int i=st;i<=en;i++)t+=s.charAt(i);
return t;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int[] x=trimIndex(s);
String t=sub(s,x[0],x[1]);
System.out.println(t.equals(s.trim()));
}
}
