package com.upgrad.industrydemo;


public class Ecatalog {

    public static void main(String[] args) {
	// write your code here
        BrandV2 b1 = new BrandV2("Nike");
        b1.setDescription("Running shoes");
        b1.preInsert();
        ProductV2 p1 = new ProductV2(b1,"Men's running shoe boost");
        p1.preInsert();

    }
}
