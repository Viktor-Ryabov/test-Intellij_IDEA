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

        String name = mountain.getName();
        int hight = mountain.getHightMountain();

        System.out.printf("В России есть гора %s и её высота %d метров!", name, hight);
    }
}
