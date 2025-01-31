package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.printf("Hola %s %s, ¿Cómo estás?%n", args[0], args[1]);
        } else {
            System.out.println("Hello world");
        }
    }
}