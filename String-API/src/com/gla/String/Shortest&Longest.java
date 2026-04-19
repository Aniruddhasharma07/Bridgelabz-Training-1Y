package com.gla.string;
import java.util.*;
public class Shortest&Longest{
static int len(String s){
int c=0;try{while(true){s.charAt(c);c++;}}catch(Exception e){}
return c;
}
static String[] split(String s){
int n=len(s),wc=1;
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
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] w=split(s);
String sh=w[0],lo=w[0];
for(int i=1;i<w.length;i++){
if(len(w[i])<len(sh))sh=w[i];
if(len(w[i])>len(lo))lo=w[i];
}
System.out.println("Shortest: "+sh);
System.out.println("Longest: "+lo);
}
}
