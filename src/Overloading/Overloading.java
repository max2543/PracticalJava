package Overloading;

import java.util.Scanner;

public class Overloading {
    // method Overloading
    int sum(int num1, int num2){
        return (num1 + num2);
    }
}

class MethodCall{
    public static void main(String[] args) {
        int x,y;

        Scanner numder = new Scanner(System.in);

        System.out.print("Please Enter number1:");
        x = numder.nextInt();

        System.out.print("Please Enter number2:");
        y = numder.nextInt();

        Overloading ol = new Overloading();

        System.out.println("Result sum is " + ol.sum(x,y) );
    }

}
