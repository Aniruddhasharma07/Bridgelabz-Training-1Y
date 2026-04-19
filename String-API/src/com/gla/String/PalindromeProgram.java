package com.gla.string;
import java.util.*;
public class PalindromeProgram{
static String input(Scanner sc){
return sc.nextLine();
}
static boolean check(String s){
int i=0,j=s.length()-1;
while(i<j){
if(s.charAt(i)!=s.charAt(j))return false;
i++;j--;
}
return true;
}
static void display(boolean b){
System.out.println(b);
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=input(sc);
display(check(s));
}
}
