package com.devtch.model;
import java.util.* ;
public class PhoneExpert {
    public List<String> getPhoneModels(String brand){
    List<String> phoneModels = new ArrayList<>() ;
    switch(brand){
        case "SAMSUNG" : phoneModels.add("Samsung Galaxy S23 Ultra");
                        phoneModels.add("Samsung Galaxy A54") ;
                       break ;
        case "APPLE" : phoneModels.add("iPhone 14") ;
        phoneModels.add("iPhone 14 Pro");
                       break ;
        case "HUAWEI" :phoneModels.add(" Huawei Mate 50 Pro") ; 
                        phoneModels.add("Huawei P50 Pro") ;
                       break ;
        case "XIAOMI"  : phoneModels.add("Xiaomi 13") ;
                        phoneModels.add("Xiaomi 12 Pro") ;
                         break ;
        case "OPPO"    : phoneModels.add("Oppo Find N2 Flip") ;
                        phoneModels.add("Oppo Find X5 Pro") ;
                         break ;

    
        }
        return phoneModels ;
    } 
}