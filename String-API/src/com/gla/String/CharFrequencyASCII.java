package com.gla.string;
import java.util.*;
public class CharFrequencyASCII{
static String[][] freq(String s){
int[]f=new int[256];
for(int i=0;i<s.length();i++)f[s.charAt(i)]++;
int c=0;
for(int i=0;i<256;i++)if(f[i]>0)c++;
String[][]r=new String[c][2];
int k=0;
for(int i=0;i<256;i++)
if(f[i]>0){
r[k][0]=String.valueOf((char)i);
r[k][1]=String.valueOf(f[i]);k++;
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
