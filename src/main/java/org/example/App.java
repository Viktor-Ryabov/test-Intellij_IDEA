package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is test push from Intellij_IDEA");

        Mountain mountain = new Mountain();
        mountain.setName("Elbrus");
        mountain.setHightMountain(5642);

        System.out.printf("В России есть гора %s, её высота %n", mountain.getName(), mountain.getHightMountain());
    }
}
