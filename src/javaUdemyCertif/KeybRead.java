package javaUdemyCertif;
import java.util.*;
public class KeybRead {
 public static void main ( String args[]) {
   Scanner s = new Scanner (System.in)	;  
   int a,b,c;
   String name ;
   System.out.println("Enter 2 number");
    a=s.nextInt();
    b=s.nextInt();
    c=a+b;
    System.out.println("sumi ist "+ c);
    System.out.println("Enter a Name ");
    name= s.next();
    System.out.println("the Name ist "+ name);
    System.out.println("Enter two nuber");
     int d = s.nextInt();
     int e= s.nextInt();
     int f= d*e;
     System.out.println("the result ist "+f );
     System.out.println("Enter your surname");
     String surname=s.nextLine() ;
     System.out.println("your surname ist "+surname );
 }
}
