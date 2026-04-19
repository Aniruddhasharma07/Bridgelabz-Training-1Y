package com.gla.string;
import java.util.*;
public class Anagram{
static boolean check(String a,String b){
if(a.length()!=b.length())return false;
int[]f=new int[256];
for(int i=0;i<a.length();i++){
f[a.charAt(i)]++;
f[b.charAt(i)]--;
}
for(int i=0;i<256;i++)if(f[i]!=0)return false;
return true;
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
System.out.println(check(a,b));
}
}
