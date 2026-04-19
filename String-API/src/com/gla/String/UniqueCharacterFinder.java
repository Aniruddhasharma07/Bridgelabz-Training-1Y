package com.gla.string;
import java.util.*;
public class UniqueCharacterFinder{
static int len(String s){
int c=0;try{while(true){s.charAt(c);c++;}}catch(Exception e){}
return c;
}
static char[] unique(String s){
int n=len(s);
char[]u=new char[n];
int k=0;
for(int i=0;i<n;i++){
char c=s.charAt(i);boolean f=true;
for(int j=0;j<i;j++)if(c==s.charAt(j))f=false;
if(f)u[k++]=c;
}
char[]r=new char[k];
for(int i=0;i<k;i++)r[i]=u[i];
return r;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[]u=unique(s);
for(char c:u)System.out.print(c+" ");
}
}
