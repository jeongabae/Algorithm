package com.study.javaex.ch6;

class Product {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public Product(){}
}

class ProductTest{
    public static void main(String[]args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는"+p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는"+p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는"+p3.serialNo);
    }
}
