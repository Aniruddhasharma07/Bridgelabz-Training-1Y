package com.gla.string;
import java.util.*;
public class StringSplit{
static int findLen(String s){
int c=0;
try{while(true){s.charAt(c);c++;}}catch(Exception e){}
return c;
}
static String[] mySplit(String s){
int n=findLen(s),wc=1;
for(int i=0;i<n;i++)if(s.charAt(i)==' ')wc++;
int[] idx=new int[wc+1];
int k=0;idx[k++]=-1;
for(int i=0;i<n;i++)if(s.charAt(i)==' ')idx[k++]=i;
idx[k]=n;
String[] w=new String[wc];
for(int i=0;i<wc;i++){
String t="";
for(int j=idx[i]+1;j<idx[i+1];j++)t+=s.charAt(j);
w[i]=t;
}
return w;
}
static boolean compare(String[]a,String[]b){
if(a.length!=b.length)return false;
for(int i=0;i<a.length;i++)if(!a[i].equals(b[i]))return false;
return true;
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] a=mySplit(s);
String[] b=s.split(" ");
System.out.println(compare(a,b));
}
}
