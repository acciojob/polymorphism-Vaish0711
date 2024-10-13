package com.driver;

public class Main {

    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }


    public static void main(String[] args) {
        // Task 2: Create object of Product
        Product p = new Product();

        System.out.println(p.product(3,4));
        System.out.println(p.product(2, 3,4));
        System.out.println(p.product(2.5,4.0));
    }
}