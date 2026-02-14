// src/main/java/Main.java
public class Main {

    // This method must be public static to be called from test
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("World"));
    }
}
