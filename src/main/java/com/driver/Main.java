package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
       int x =  p.product(2,3);
       int y =  p.product(3,4,5);
       double z =  p.product(2.3,2.3);
    }
}
class Product{

    public  int product(int x, int y)
    {
     return x+y;
    }
    public int product(int x, int y, int z)
    {
       return x+y+z;
    }
    public double product(double x , double y)
    {
        return x+y;
    }

}