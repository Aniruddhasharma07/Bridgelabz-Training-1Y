package com.gla.string;
import java.util.*;
public class RPS{
static String comp(){
int r=(int)(Math.random()*3);
if(r==0)return"rock";
if(r==1)return"paper";
return"scissors";
}
static int win(String u,String c){
if(u.equals(c))return 0;
if((u.equals("rock")&&c.equals("scissors"))||(u.equals("paper")&&c.equals("rock"))||(u.equals("scissors")&&c.equals("paper")))return 1;
return -1;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),uw=0,cw=0;
for(int i=0;i<n;i++){
String u=sc.next();
String c=comp();
int r=win(u,c);
if(r==1)uw++;else if(r==-1)cw++;
}
System.out.println("User Wins: "+uw);
System.out.println("Computer Wins: "+cw);
System.out.println("User %: "+(uw*100.0/n));
System.out.println("Computer %: "+(cw*100.0/n));
}
}
