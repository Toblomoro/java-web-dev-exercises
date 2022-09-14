package exercises.technology;

import java.util.ArrayList;
import java.util.HashMap;

public class Smartphone extends Computer {


    public class s22 {
        String name = "Samsung Galaxy s22";
        String releaseDate = "02/25/2022";
        Integer storage = 256; //Gb
        String cpu = "Octa-core 4x1.80 GHz Cortex-A510";
        Double price = 799.99; //$
        double weight = 5.89; //oz
        double display = 6.1; //inch
    }

    ;





       /* String name = "Nokia 3310";
        String releaseDate = "05/24/2017";
        Integer storage = 16; //mb
        String cpu = "Nokia 1 core";
        Double price = 99.99; //$
        double weight = 5.7; //oz
        double display = 2.40; //inch*/


    public static HashMap<String, String> nokiaMethod() {
        HashMap<String, String> nokia = new HashMap<String, String>();
        nokia.put("Name", "Nokia 3310");
        nokia.put ("Release Date", "05/24/2017");
        nokia.put ("Storage", "16 mb");
        nokia.put ("CPU", "Nokia 1 core");
        nokia.put ("Price", "99.99");
        nokia.put ("Weight", "5.7 oz");
        nokia.put("Display size", " 2.4 inches")


        return nokia;
    }
}




        //property
        //method

