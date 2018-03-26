package com.company;
// Підключення до класу математичних функцій

import static java.lang.Math.*;


public class Urav {
    public double a, b, c;
    //private static final double Pi = 3.14;

    Urav(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    //urav 1
    public double ur1() {
        return (sin(b) + pow(cos(pow(c, 2)), 2)) / pow(a * b - c, 2);
    }

    //urav 2
    public double ur2(int n, double x) {
        int i = 1;
        double y = 1;

        while (i <= n) {
            y *= (i - (2 * sqrt(x)) / pow(i, 2) - x);
            i++;
        }

        return y;
    }

    //urav 3
    public double ur3(int i) {
        double y = 0;
        int n = 3;
        for (double j = n; j < i+1; j += 0.5) {
            y += (pow(n, 2) + sqrt(pow(n, 2) + 2));
        }
        return y;
    }

}
