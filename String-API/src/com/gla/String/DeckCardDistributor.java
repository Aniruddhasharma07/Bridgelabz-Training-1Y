package com.gla.string;
import java.util.*;
public class DeckCardDistributor{
static String[] init(){
String[]s={"Hearts","Diamonds","Clubs","Spades"};
String[]r={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
String[]d=new String[s.length*r.length];
int k=0;
for(String i:s)for(String j:r)d[k++]=j+" of "+i;
return d;
}
static void shuffle(String[]d){
for(int i=0;i<d.length;i++){
int r=i+(int)(Math.random()*(d.length-i));
String t=d[i];d[i]=d[r];d[r]=t;
}
}
static String[][] deal(String[]d,int n,int p){
if(n%p!=0)return null;
int c=n/p,k=0;
String[][]pl=new String[p][c];
for(int i=0;i<p;i++)
for(int j=0;j<c;j++)
pl[i][j]=d[k++];
return pl;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),p=sc.nextInt();
String[]d=init();
shuffle(d);
String[][]pl=deal(d,n,p);
for(int i=0;i<pl.length;i++){
System.out.println("Player "+(i+1));
for(String c:pl[i])System.out.println(c);
}
}
}
