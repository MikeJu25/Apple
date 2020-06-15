package ui.model;

import SQL.AppleProductDataBase;

import java.util.ArrayList;

public class Result {

    public static ArrayList<String> getResultAll() {
        ArrayList<String> results = AppleProductDataBase.getPhoneInfo();
        return results;
    }
}
