package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int x = p.product(2, 3);
        int y = p.product(3, 4, 5);
        double z = p.product(2.3, 2.3);
    }

    public static  class Product {

        public int product(int x, int y) {
            int a= x*y;
            return a;
        }

        public int product(int x, int y, int z) {
           int b  = x*y*z;
           return b;
        }

        public double product(double x, double y) {
            double c = x*y;
            return c;
        }

    }
}