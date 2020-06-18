package ui.model;

import SQL.AppleProductDataBase;

import java.util.ArrayList;

public class Result {




   public static ArrayList<String> resultsAll = AppleProductDataBase.getPhoneInfo();
    public static ArrayList<String> resultsPLTH = AppleProductDataBase.priceHighToLow();
    public static ArrayList<String> resultsYNTO64 = AppleProductDataBase.newestToOldest();
    public static ArrayList<String> resultsAvgPrice = AppleProductDataBase.iPhoneAvgPrice();
    public static ArrayList<String> resultsAppAllDis = AppleProductDataBase.iphAppToAllDiscounts();
    public static ArrayList<String> resultsDiscount = AppleProductDataBase.selectDiscount();
    public static ArrayList<String> resultsRetailed = AppleProductDataBase.showRetailedThrough();
    public static ArrayList<String> resultsHigher6 = AppleProductDataBase.avgPriceHigher6();

    public static ArrayList<String> getResultAll() {
        ArrayList<String> results = AppleProductDataBase.getPhoneInfo();
        return results;
    }

}
