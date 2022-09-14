package exercises.technology;

import java.util.ArrayList;
import java.util.HashMap;

public class Smartphone extends Computer {


    private static String nokiaDisplay;

    /*public class s22 {
            String name = "Samsung Galaxy s22";
            String releaseDate = "02/25/2022";
            Integer storage = 256; //Gb
            String cpu = "Octa-core 4x1.80 GHz Cortex-A510";
            Double price = 799.99; //$
            double weight = 5.89; //oz
            double display = 6.1; //inch
        }*/
    public static HashMap<String, String> s22Method() {
        HashMap<String, String> s22 = new HashMap<String, String>();
        s22.put("Name", "Samsung Galaxy s22");
        s22.put ("Release Date", "02/25/2022");
        s22.put ("Storage", "256 mb");
        s22.put ("CPU", "Octa-core 4x1.80 GHz Cortex-A510");
        s22.put ("Price", "799.99");
        s22.put ("Weight", "5.8 oz");
        s22.put("Display size", " 6.1 inches");


        return s22;
    }






       /* String name = "Nokia 3310";
        String releaseDate = "05/24/2017";
        Integer storage = 16; //mb
        String cpu = "Nokia 1 core";
        Double price = 99.99; //$
        double weight = 5.7; //oz
        double display = 2.40; //inch*/


    public static ArrayList<String> nokiaMethod() {
        ArrayList<String> nokia = new ArrayList<>();
        nokia.add("Name: Nokia 3310");
        nokia.add("Release Date: 05/24/2017");
        nokia.add("Storage: 16 mb");
        nokia.add("CPU: Nokia 1 core");
        nokia.add ("Price: 99.99");
        nokia.add ("Weight: 5.7 oz");
        nokia.add("Display size:  2.4 inches");



        return nokia ;
    }
}




        //property
        //method

