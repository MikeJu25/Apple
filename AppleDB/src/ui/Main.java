package ui;
// how can customer choose the amount their food want to be


import SQL.AppleProductDataBase;
import sun.rmi.runtime.Log;

public class Main {


    public static void main(String[] args) {
        //System.out.println(AppleProductDataBase.selectDiscount().get(1));
        //new AdministratorTable();
        for (int i = 0; i < 10; i++) {
            System.out.println(AppleProductDataBase.updateDl("0.2","Staff30").get(i));
        }
    }
}
