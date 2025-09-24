public class Tester {
    public static void main(String[] args) {
        Tester tester = new Tester();
        int result = tester.sum(5);
        System.out.println("Sum: " + result);
    }

    public int sum(int n){
        System.out.println("Input: " + n);
        int result;
        // base condition
        if(n == 1){
            result = 1;
            System.out.println("Base condition fulfilled.");
        }else {
            // recursive call
            result = n + sum(n-1);
        }
        System.out.println("Result: " + result);
        return result;
    }
}





































//package com.tutorialspoint;
//
//public class Tester {
//    public static void main(String[] args) {
//        Tester tester = new Tester();
//
//        int result = tester.fact(5);
//        System.out.println("Factorial: " + result);
//    }
//    public int fact(int n) {
//
//        return n == 1 ? 1: n * fact(n-1);
//    }
//}










//package com.tutorialspoint;
//
//public class Tester {
//    public static void main(String[] args) {
//        Tester tester = new Tester();
//        int result = tester.fibo(5);
//        System.out.println("Fibbonacci: " + result);
//    }
//
//    public int fibo(int n) {
//        return n <= 1 ? n : fibo(n-1) + fibo(n-2);
//    }
//}