package com.gla.string;
import java.util.*;
public class FibonacciGenerator{
static void fib(int n){
int a=0,b=1;
for(int i=1;i<=n;i++){
System.out.print(a+" ");
int c=a+b;
a=b;b=c;
}
}
public static void main(String[]x){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fib(n);
}
}
