package com.gla.string;
import java.util.*;
public class CharFrequencyUnique{
static char[] unique(String s){
char[]u=new char[s.length()];
int k=0;
for(int i=0;i<s.length();i++){
char c=s.charAt(i);boolean f=true;
for(int j=0;j<i;j++)if(c==s.charAt(j))f=false;
if(f)u[k++]=c;
}
char[]r=new char[k];
for(int i=0;i<k;i++)r[i]=u[i];
return r;
}
static String[][] freq(String s){
int[]f=new int[256];
for(int i=0;i<s.length();i++)f[s.charAt(i)]++;
char[]u=unique(s);
String[][]r=new String[u.length][2];
for(int i=0;i<u.length;i++){
r[i][0]=String.valueOf(u[i]);
r[i][1]=String.valueOf(f[u[i]]);
}
return r;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[][]r=freq(s);
for(int i=0;i<r.length;i++)
System.out.println(r[i][0]+" "+r[i][1]);
}
}
