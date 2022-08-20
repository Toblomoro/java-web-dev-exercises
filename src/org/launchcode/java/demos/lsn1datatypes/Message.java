package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("ger")) {
            return "Hallo Welt!";
        } else if (lang.equals("eng")) {
            return "Hello, World!";
        } else {
            return "Please reload and make a proper choice";
        }
    }
}
