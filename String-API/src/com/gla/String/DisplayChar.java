package com.gla.string;
import java.util.*;
public class DisplayChar{
static String type(char c){
if(c>=65&&c<=90)c=(char)(c+32);
if(c>='a'&&c<='z'){
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return"Vowel";
else return"Consonant";
}
return"Not Letter";
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String[][] arr=new String[s.length()][2];
for(int i=0;i<s.length();i++){
arr[i][0]=String.valueOf(s.charAt(i));
arr[i][1]=type(s.charAt(i));
}
for(int i=0;i<arr.length;i++)
System.out.println(arr[i][0]+" "+arr[i][1]);
}
}
