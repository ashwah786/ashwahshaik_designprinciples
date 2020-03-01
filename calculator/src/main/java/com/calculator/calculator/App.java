package com.calculator.calculator;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first operand:");
        float x = sc.nextFloat();
        System.out.println("Enter the Second operand:");
        float y = sc.nextFloat();
        System.out.println("Enter the operation you wish to do:");
        String operand = sc.next();       
        if(operand.equals("+")){
            Addition add = new Addition(x, y);
            System.out.println(add.addtwonumbers(x,y));
        }
        else if(operand.equals("-")){
            Subtraction sub = new Subtraction(x, y);
            System.out.println(sub.subtwonumbers(x,y));
        }
        else if(operand.equals("*")){
            Mutliply mul = new Mutliply(x,y);
            System.out.println(mul.multwonumbers(x, y));
        }
        else if(operand.equals("/")){
            Divide div = new Divide(x,y);
            System.out.println(div.divtwonumbers(x, y));
        }
        else{
            System.out.println("No such option is available in our calculator");
        }
    }
}
