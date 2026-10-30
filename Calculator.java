public class Calculator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        String magic="===================Magic==================";
        System.out.println("==========Method 1===========");
        System.out.println("Addition of a and b:- " + sum);
        System.out.println("Substraction of a and b:- " + diff);
        System.out.println("Multiplication of a and b:- " + mul);
        System.out.println("Division of a and b:- " + div);
        System.out.println("==========Method 2===========");
        System.out.println("Addition of a and b:- " + (a+b));
        System.out.println("Substraction of a and b:- " + (a-b));
        System.out.println("Multiplication of a and b:- " + (a*b));
        System.out.println("Division of a and b:- " + (a/b));
        System.out.println("Remainder:- " + (a%b));
        System.out.println(magic);
        System.out.println("Addition:- " + (a+b) + " Substraction:- " + (a-b) + " Multiplication:- " + (a*b) + " Division:- " + (a/b));
        System.out.println("===================Geuss the answers==================");
        System.out.println("Uninary Operator " + (a++));
        System.out.println("Uninary Operator " + (++b));
        System.out.println("Binary Operator");
        System.out.println("1+2 "+1+2);
        System.out.println("1+2 "+(1+2));
        System.out.println(1+2 +"= 3");
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternany Operator");
        int largestNumber = (a>b)?a:b;
        System.out.println("Largest of 2 numbers:- " + largestNumber);
    }
}