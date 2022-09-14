package exercises.technology;

import java.util.HashMap;

public class Laptop extends Computer{
    public class raider {
            String name = "MSI GE76 Raider";
            String releaseDate = "05/12/2022";
            Integer storage = 2 ; //Tb
            String cpu = "Intel Core i9-12900HK";
            Double price = 3999.99; //$
            double weight = 6.39; //lb
            double display = 17.3; //inch
    }
    public static HashMap<String, String> raiderMethod() {
        HashMap<String, String> raider = new HashMap<String, String>();
        raider.put("Name", "MSI GE76 Raider");
        raider.put ("Release Date", "05/12/2022");
        raider.put ("Storage", "2 tb");
        raider.put ("CPU", "Intel Core i9-12900HK");
        raider.put ("Price", "3999.99");
        raider.put ("Weight", "6.39");
        raider.put("Display size", "17.3 inches");


        return raider;
    }
    public class ASUS {

        String name = "ASUS Q304U";
        String releaseDate = "12/04/2017";
        Integer storage = 500 ; //Gb
        String cpu = "i5-7200U CPU @ 2.50GHz";
        Double price = 549.99; //$
        double weight = 3.31; //lb
        double display = 13.3; //inch
    }
    public static HashMap<String, String> asusMethod() {
        HashMap<String, String> asus = new HashMap<String, String>();
        asus.put("Name", "ASUS Q304U");
        asus.put ("Release Date", "12/04/2017");
        asus.put ("Storage", "500gb");
        asus.put ("CPU", "i5-7200U CPU @ 2.50GHz");
        asus.put ("Price", "549.99");
        asus.put ("Weight", "3.31");
        asus.put("Display size", "13.3 inches");


        return asus;
    }



    //property
    //method
}
