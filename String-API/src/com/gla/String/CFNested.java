package com.gla.string;
import java.util.*;
public class CFNested{
static String[] freq(String s){
char[]c=s.toCharArray();
int[]f=new int[c.length];
for(int i=0;i<c.length;i++){
if(c[i]=='0')continue;
f[i]=1;
for(int j=i+1;j<c.length;j++)
if(c[i]==c[j]){f[i]++;c[j]='0';}
}
int k=0;
for(int i=0;i<c.length;i++)if(c[i]!='0')k++;
String[]r=new String[k];
int x=0;
for(int i=0;i<c.length;i++)
if(c[i]!='0'){r[x++]=c[i]+" "+f[i];}
return r;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[]r=freq(s);
for(String i:r)System.out.println(i);
}
}
