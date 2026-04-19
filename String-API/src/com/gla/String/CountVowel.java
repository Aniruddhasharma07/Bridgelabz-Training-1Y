package com.gla.string;
import java.util.*;
public class CountVowel{
static String type(char c){
if(c>=65&&c<=90)c=(char)(c+32);
if(c>='a'&&c<='z'){
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return"Vowel";
else return"Consonant";
}
return"Not";
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int v=0,c=0;
for(int i=0;i<s.length();i++){
String t=type(s.charAt(i));
if(t.equals("Vowel"))v++;
if(t.equals("Consonant"))c++;
}
System.out.println("Vowels: "+v);
System.out.println("Consonants: "+c);
}
}
