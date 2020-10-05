package Swap;

public class Swap {
    int num1, num2, a, b;

    public Swap(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

class SwapSecond{
    void swap(Swap s) {
        int output;
        output = s.num1;
        s.num1 = s.num2;
        s.num2 = output;
    }
}

class callSwap{
    public static void main(String[] args) {
        Swap s1 = new Swap(20,15);

        System.out.println("BeFore Swapint:" + s1.num1 +  "\t" + s1.num2);

        SwapSecond s2 = new SwapSecond();
        s2.swap(s1);
        System.out.println("After Swaping:" + s1.num1 +  "\t" + s1.num2);
    }

}
