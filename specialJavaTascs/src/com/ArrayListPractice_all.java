package com;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_all {



    public static void main(String[] args) {



        ArrayList<String> productLst = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));
        System.out.println(productLst);
        System.out.println("----Task 1----");
        //         * Task 1 : print only items name
        for(String eachProduct:productLst){
            System.out.println("Each name - "+eachProduct.split(",")[0]);
        }
        for(int i=0;i<productLst.size();i++){
            String namePart = productLst.get(i).split(",")[0];
        }
        System.out.println("----Task 2----");
        //         * Task 2 : print all the prices more than 500
        for(String eachProduct:productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if(price>500){
                System.out.println("price more 500 = " + price);
            } }
        System.out.println("----Task 3----");
        //   * Task 3 : print average price
        double sum =0;
        double everage =0;
        for(String eachProduct:productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum+=price;
        }
        System.out.println("everage = " + (everage=sum/productLst.size()));
        System.out.println("----Task 4----");
        //     * Task 4 : print all the items name that has less than 20$ monthly payment.
        for(String eachProduct:productLst){
            double monthlyPrice = Double.parseDouble(eachProduct.split(",")[2]);
            if(monthlyPrice<20){
                System.out.println("each product < 20 in month - "+eachProduct.split(",")[0]);
            } }
        System.out.println("----Task 5----");
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for(String eachProduct:productLst){
            if(eachProduct.contains("iPhone")){
                double monthlyPrice = Double.parseDouble(eachProduct.split(",")[2]);
                System.out.println("iPhone - "+monthlyPrice);
            } }
        System.out.println("----Task 6----");
        //* Task 6 : Print all information about most expensive items.
        double maxPrice =Double.parseDouble(productLst.get(0).split(",")[1]);
        String maxName = productLst.get(0).split(",")[0];
        for(String eachProduct:productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if(price>maxPrice){
                maxPrice=price;
                maxName = eachProduct;
            } }
        System.out.println("Max price product - "+maxName);
        System.out.println("----Task 7----");
//         * Task 7 : Update Dyson price to 80% off
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i;
            } }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;
        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);
        System.out.println("----Task 8----");
//         * Task 8 : Count the items prices more than average price.
        int cnt =0;
        everage = sum/12;
        for( String eachProduct : productLst){
            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
            if(price1>everage){
                cnt++;
            } }
        System.out.println("the items prices more than average price = " + cnt);
        System.out.println("----Task 9----");
//         * Task 9 : Remove all the items has more than average price.
        for(int i=0;i<productLst.size();i++){
            double price1 = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(price1>everage){
                productLst.remove(productLst.get(i));
                i--;                                    // don't forget "i--" because shift if stay together
            }}
        System.out.println("productLst = " + productLst.size());
        System.out.println("productLst = " + productLst);
        System.out.println("----Task 10----");
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNumes = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monphlyPaiment = new ArrayList<>();

        for(String eachProduct : productLst){
            itemNumes.add((eachProduct.split(",")[0]));
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monphlyPaiment.add(monthlyPart);
        }
        System.out.println("itemNumes = " + itemNumes);
        System.out.println("prices = " + prices);
        System.out.println("monphlyPaiment = " + monphlyPaiment);



    }
}