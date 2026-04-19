package com.gla.string;
import java.util.*;
public class Palindrome{
static boolean check1(String s){
int i=0,j=s.length()-1;
while(i<j){if(s.charAt(i)!=s.charAt(j))return false;i++;j--;}
return true;
}
static boolean check2(String s,int i,int j){
if(i>=j)return true;
if(s.charAt(i)!=s.charAt(j))return false;
return check2(s,i+1,j-1);
}
static boolean check3(String s){
char[]a=s.toCharArray();
String r="";
for(int i=s.length()-1;i>=0;i--)r+=s.charAt(i);
return s.equals(r);
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(check1(s));
System.out.println(check2(s,0,s.length()-1));
System.out.println(check3(s));
}
}
