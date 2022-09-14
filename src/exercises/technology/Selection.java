package exercises.technology;

public class Selection {
    public static String getMenuChoice(String menuChoice) {
        if (menuChoice.equals("1")) {
           return "You chose Durability, maybe you should be a little more careful? However i do have the perfect phone for you\n";

            Smartphone.nokiaMethod().forEach((key, value) -> System.out.println(key + ":" + value));
        }else if ((menuChoice.equals("2"))) {
            return "You chose Gaming, maybe you should get out side more luckily i have 2 options for you\n";
            Smartphone.s22Method().forEach((key, value) -> System.out.println(key + ":" + value));
            Laptop.raiderMethod().forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
