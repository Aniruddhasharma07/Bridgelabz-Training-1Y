package com.gla.string;
import java.util.*;
public class StrLen{
static int findLen(String s){
int c=0;
try{
while(true){s.charAt(c);c++;}
}catch(Exception e){}
return c;
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println("User Method Length: "+findLen(s));
System.out.println("Built-in Length: "+s.length());
}
}
