package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println(sum(5, 13, 3));
        //for (int i = 0; i < 11; i++) {
        //System.out.println(i + " " + f(i) + " " + f2(i));
        //}
        // Homework 2
        //System.out.println(product_recursive(9));
        //System.out.println(product_loop(9));
        // Homework 3
        //for (int i = 0; i <= 10 ; i++)
        //System.out.println(i + " " + telephone_numbers(i) + " " + telephone_numbers_2(i));
        // Homework 4
        //System.out.println(searcherSequential("car", 'r'));
        // Homework 5
        //System.out.println(palindrome("refer"));
        // Homework 6
        //final int n = 5;
        //int[] bits = new int [n];
        //print(n, bits);
        // Homework 7
        int[] LIST = new int[]{2, 2, 1, 5, 0, 0};
        int n = LIST.length;
        int[] list = new int[n];
        sums(n, list, LIST);

    }

    public static void print(int n, int[] bits) {
        if (n == 0)
            System.out.println(java.util.Arrays.toString(bits));
        else {
            bits[bits.length - n] = 0;
            print(n - 1, bits);
            bits[bits.length - n] = 1;
            print(n - 1, bits);
        }
    }

    public static int sum(int a, int b, int c) {
        if (b < a)
            return 0;
        else
            return sum(a, b - c, c) + b;
    }

    public static int f(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 2;
        else
            return 2 * f(n - 1) + f(n - 2) - 1;
    }

    public static int f2(int n) {
        int nCurrent = 1;
        int fCurrent = 2;
        int fPrev = 1;

        while (nCurrent < n) {
            int fNext = 2 * fCurrent + fPrev - 1;
            fPrev = fCurrent;
            fCurrent = fNext;
            nCurrent++;
        }
        return fCurrent;
    }

    public static int product_recursive(int n) {
        if (n == 1)
            return 1;
        else
            return product_recursive(n - 1) * n;
    }

    public static int product_loop(int n) {
        int product = 1;
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }

    public static int telephone_numbers(int n) {
        if (n <= 1)
            return 1;
        else
            return (telephone_numbers(n - 1) + (n - 1) * telephone_numbers(n - 2));

    }

    public static int telephone_numbers_2(int n) {
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int b_2 = b;
            b = a;
            a = a + (i - 1) * b_2;
        }
        return a;
    }

    public static boolean searcherSequential(String word, char key) {
        if (word.charAt(0) == key)
            return true;
        else if (word.length() == 1)
            return false;
        else
            return searcherSequential(word.substring(1, word.length()), key);
    }

    public static boolean palindrome(String word) {
        if (word.length() <= 1)
            return true;
        else if (word.charAt(0) == word.charAt(word.length() - 1))
            return palindrome(word.substring(1, word.length() - 1));
        else
            return false;
    }

    //public static boolean sumUp(int[] nums, int n, int i){
    //  if (nums[i]) == n)
    //    return true;
    //else if (return sumUP(nums, n-nums[i], i+1) == true)
    //  return true;
    //else
    //  return sumUP(nums, n, i+1);
    //}
    public static void sums(int n, int[] list, int[] LIST) {
        if (n == 0) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 0) {
                    sum1 += LIST[i];
                    list1.add(LIST[i]);
                }
                else {
                    sum2 += LIST[i];
                    list2.add(LIST[i]);
                }
            }
            if (sum1 == sum2)
                System.out.println("A: " + list1 + " B: " + list2);
        } else {
            list[list.length - n] = 0;
            sums(n - 1, list, LIST);
            list[list.length - n] = 1;
            sums(n - 1, list, LIST);
        }
    }
}