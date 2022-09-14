package exercises.technology;

import java.util.Map;


import static exercises.technology.Laptop.asusMethod;
import static exercises.technology.Laptop.raiderMethod;
import static exercises.technology.Smartphone.nokiaMethod;
import static exercises.technology.Smartphone.s22Method;

public class Selection{




    public static String getMenuChoice(String menuChoice) {
        if (menuChoice.equals("1")) {

            return "You chose Durability, maybe you should be a little more careful? However i do have the perfect phone for you\n" + nokiaMethod();
            //Smartphone.nokiaMethod().forEach((key, value) -> System.out.println(key + ":" + value));

        } else if ((menuChoice.equals("2"))) {
            return "You chose Gaming, maybe you should get out side more luckily i have 2 options for you\n" +s22Method() +"\n" + raiderMethod();}
            else if ((menuChoice.equals("3"))) {
                return "You chose Portability, maybe you could use the exercise our lightest options are\n" +nokiaMethod() +"\n" + asusMethod();

        }            else if ((menuChoice.equals("4"))) {
            return "You chose Work Flexibility, personally i think you should do more work with your hands but the most capable is the \n" + s22Method();

        }           else if ((menuChoice.equals("5"))) {
            return "You chose Picture editing, I agree you should edit every picture of you, our most powerful options are\n" + s22Method() + raiderMethod();

        }else {
            return "Well if you wont choose then you are stuck with the rather economical \n";
            //Laptop.asusMethod().forEach((key, value) -> System.out.println(key + ":" + value));
        }
    }
}
