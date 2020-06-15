package ui.model;

import SQL.AppleProductDataBase;

import java.util.ArrayList;

public class Result {

   public static ArrayList<String> resultsAll = AppleProductDataBase.getPhoneInfo();

}
