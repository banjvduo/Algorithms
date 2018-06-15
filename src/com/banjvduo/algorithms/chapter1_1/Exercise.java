package com.banjvduo.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

public class Exercise {

    @Test
    public void solution001() {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    @Test
    public void solution002() {
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    public static void solution003() {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a == b && a == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }


    @Test
    public void solution007() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum1++;
            }
        }
        StdOut.println(sum1);
    }

    @Test
    public void solution008() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    @Test
    public void solution009() {
        String s = "";
        int num = 10;
        System.out.println(Integer.toBinaryString(num));
        for (int i = num; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }

    @Test
    public void solution011() {
        boolean[][] matrix = {{true, false, true}, {false, true, true}, {false, false, false}};
        System.out.print(' ');
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? '*' : ' ');
            }
            System.out.println();
        }
    }

    @Test
    public void solution013() {
        int[][] matrix = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    @Test
    public void solution014() {
        System.out.println(lg(1025));
    }

    public static int lg(int n) {
        int x = 0;
        while ((2 << (x - 1)) <= n) {
            x++;
        }
        return x - 1;
    }

    @Test
    public void solution015() {
        int aLength = 20;
        int m = 22;
        int[] a = new int[aLength];
        for (int i = 0; i < aLength; i++) {
            a[i] = StdRandom.uniform(m);
        }
        for (int i = 0; i < aLength; i++) {
            StdOut.printf("%4d", a[i]);
        }
        int[] mArr = histogram(a, m);
        int sum = 0;
        for (int i = 0; i < mArr.length; i++) {
            sum += mArr[i];
        }
        StdOut.println();
        for (int i = 0; i < m; i++)
            StdOut.printf("%4d", mArr[i]);
        StdOut.println();

        System.out.println(a.length);
        System.out.println(sum);
    }

    public static int[] histogram(int[] a, int m) {
        int[] mArr = new int[m];
        for (int j = 0; j < a.length; j++) {
            mArr[a[j]]++;
        }
        return mArr;
    }

    @Test
    public void solution016() {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    @Test
    public void solution019() {
        long[] fibanacci = fibanacciBetter(99);
        for (int i = 0; i < 100; i++) {
            StdOut.println(i+ " "+ fibanacci[i]);
        }
    }

    public static long fibanacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibanacci(n - 1) + fibanacci(n - 2);
    }

    public static long[] fibanacciBetter(int n) {
        long[] fibonacci = new long[n + 1];
        if (n == 0) {
            return fibonacci;
        }
        fibonacci[1] = 1;
        if (n == 1) {
            return fibonacci;
        }
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    @Test
    public void solution020() {
        System.out.println(ln(10));
    }

    public static double ln(int m) {
        if (m == 0) {
            return 0;
        }
        return Math.log(m) + ln(m - 1);
    }

    public static void main(String[] args) {
//        solution003();
    }




}
