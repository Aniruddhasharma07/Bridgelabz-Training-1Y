package com.gla.string;
import java.util.*;
public class NumberGuessingGame{
static int generate(int low,int high){
return low+(int)(Math.random()*(high-low+1));
}
static String feedback(Scanner sc){
return sc.next();
}
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int low=1,high=100;
while(true){
int guess=generate(low,high);
System.out.println("Guess: "+guess);
String f=feedback(sc);
if(f.equalsIgnoreCase("correct"))break;
else if(f.equalsIgnoreCase("high"))high=guess-1;
else if(f.equalsIgnoreCase("low"))low=guess+1;
}
}
}
