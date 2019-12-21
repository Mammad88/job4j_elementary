package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item1 = new Item(name);
                tracker.findAll();

            } else if (select == 2) {
                 System.out.println("=== Edit item ===");
                 System.out.println("Enter name: ");
                 String name2 = scanner.nextLine();
                 System.out.println("Enter id: ");
                 String id = scanner.nextLine();
                 Item item1 = new Item(name2);
                 tracker.replace(id, item1);

            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("Enter name: ");
                String name3 = scanner.nextLine();
                System.out.println("Enter id: ");
                String id2 = scanner.nextLine();
                Item item2 = new Item(name3);
                tracker.delete(id2);

            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter id: ");
                String id =  scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name: ");
                String name3 = scanner.nextLine();
                tracker.findByName(name3);
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}