package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(sum(5, 13, 3));
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " " + f(i) + " " + f2(i));
        }
        // Homework 2
        System.out.println(product_recursive(9));
        System.out.println(product_loop(9));
        // Homework 3
        System.out.println();

    }

    public static int sum(int a, int b, int c){
        if (b < a)
            return 0;
        else
            return sum( a,b - c, c) + b;
    }
    public static int f(int n){
        if (n==0)
            return 1;
        else if (n==1)
            return 2;
        else
            return 2*f(n-1) + f(n-2) -1;
    }

    public static int f2(int n){
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int b_2 = b;
            b=a;
            a = 2*a+b_2-1;
        }
        return a;
    }

    public static int product_recursive(int n){
        if (n==1)
            return 1;
        else
            return product_recursive(n-1) * n;
    }

    public static int product_loop(int n){
        int product = 1;
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
}