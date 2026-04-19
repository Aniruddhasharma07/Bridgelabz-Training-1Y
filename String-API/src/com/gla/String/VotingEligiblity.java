package com.gla.string;
import java.util.*;
public class VotingEligiblity{
static int[] ages(int n){
int[] a=new int[n];
for(int i=0;i<n;i++)a[i]=(int)(Math.random()*90);
return a;
}
static String[][] check(int[]a){
String[][] r=new String[a.length][2];
for(int i=0;i<a.length;i++){
r[i][0]=String.valueOf(a[i]);
r[i][1]=(a[i]>=18)?"true":"false";
}
return r;
}
public static void main(String[]x){
String[][] r=check(ages(10));
for(int i=0;i<r.length;i++)
System.out.println(r[i][0]+" "+r[i][1]);
}
}
