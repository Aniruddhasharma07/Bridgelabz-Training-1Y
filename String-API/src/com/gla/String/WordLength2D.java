package com.gla.string;
import java.util.*;
public class WordLength2D{
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
static String[][] make2D(String[]w){
String[][] a=new String[w.length][2];
for(int i=0;i<w.length;i++){
a[i][0]=w[i];
a[i][1]=String.valueOf(len(w[i]));
}
return a;
}
public static void main(String[]z){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[] w=split(s);
String[][] a=make2D(w);
for(int i=0;i<a.length;i++)
System.out.println(a[i][0]+" "+Integer.parseInt(a[i][1]));
}
}
