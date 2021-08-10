package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Triangle {    
  public int edgeCase1;    
  public int edgeCase2;    
  public int edgeCase3;    
  
  Triangle(int t, int a, int i) {        
    edgeCase1 = t;        
    edgeCase2 = a;        
    edgeCase3 = i;    
  }    
  
  public double getArea(int edgeCase1, int edgeCase2, int edgeCase3) {        
    double temp = getLength(edgeCase1, edgeCase2, edgeCase3) / 2;
    double  tempArea  =  Math.sqrt(temp  *  (temp  -  edgeCase1)  *  (temp  -  edgeCase2)  *  (temp  - edgeCase3));        
    return tempArea;    
  }    
  
  public double getLength(int edgeCase1, int edgeCase2, int edgeCase3) {        
    double perimeter = edgeCase1 + edgeCase2 + edgeCase3;        
    return perimeter;    
  }    
  
  public static void main(String args[]) {        
    boolean done = false;        
    do {            
      System.out.println("Hi There! Welcome to Triangle Area Calculator!");            
      System.out.println("Please enter the length of the first edge: ");            
      Scanner input = new Scanner(System.in);            
      int edge1 = input.nextInt();            
      System.out.println("Please enter the length of the second edge: ");            
      int edge2 = input.nextInt();            
      System.out.println("Please enter the length of the third edge: ");            
      int edge3 = input.nextInt();
      Triangle math = new Triangle(edge1, edge2, edge3);            
      System.out.println("Your area is: " + math.getArea(edge1, edge2, edge3) + " !");            
      System.out.println("Your perimeter is: " + math.getLength(edge1, edge2, edge3) + " !");            
      System.out.println("Would you like to run it back?");            
      System.out.println("Press 1 to run it back");            
      System.out.println("Press 2 or any other character to quit");            
      int choice = input.nextInt();            
      if (choice == 1) {                
        continue;            
      }            
      done = true;        
    } while(!done);    
  }
}




