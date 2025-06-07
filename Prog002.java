
/**
 * Write a program to demonstrate different arithematical operartors.
 *
 * Anoop Verma
 * 08-Jun-2025
 */
public class Prog002
{
    public static void main(String[] args)
    {
        int num1 = 12;
        int num2 = 5;
        
        int sum = num1+num2;
        int dif = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int rem = num1%num2;
        
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
        System.out.println("Differenece of " + num1 + " and " + num2 + " = " + dif);
        System.out.println("Product " + num1 + " and " + num2 + " = " + mul);
        System.out.println("Quotient of " + num1 + " and " + num2 + " = " + div);
        System.out.println("Remainder of " + num1 + " and " + num2 + " = " + rem);
    }
}
