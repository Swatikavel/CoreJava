package basic_java;

public class system_getProperty {
    public static void main (String[] args){
        // Display Java Version
        System.out.println("ln Java Version"+ System.getProperty("Java.version"));

        // Display Java Runtime Version
        System.out.println("Java Runtime version"+ System.getProperty("Java.runtime.version"));

        // Display Java Home Directory
        System.out.println("Java Home"+ System.getProperty("Java.Home"));

        // Display Java Vendor Name
        System.out.println("Java Vendor"+ System.getProperty("Java.Vendor"));

        // Display Java Vendor URl
        System.out.println("Java Vendor URL"+ System.getProperty("Java.Vendor,URL"));

        // Display Java Class Path
        System.out.println("Java Class Path"+ System.getProperty("Java.Class,Path")+"ln");






    }
        }

