/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory.management.system;

import inventorymanagementsystem.Inventory;
import inventorymanagementsystem.Product;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory(10);

        while (true) {
            System.out.println("\nInventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Search Product by Name");
            System.out.println("5. Sort Products by Name");
            System.out.println("6. Sort Products by Price");
            System.out.println("7. Sort Products by Quantity");
            System.out.println("8. Display Inventory");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Product ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Product Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Product Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter Product Quantity: ");
                        int quantity = scanner.nextInt();
                        inventory.addProduct(id, name, price, quantity);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter the correct data types.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter Product ID to remove: ");
                        int id = scanner.nextInt();
                        inventory.removeProduct(id);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a numeric Product ID.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter Product ID to search: ");
                        int id = scanner.nextInt();
                        Product productById = inventory.searchProductById(id);
                        System.out.println(productById != null ? productById : "Product not found.");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a numeric Product ID.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 4:
                    System.out.print("Enter Product Name to search: ");
                    String name = scanner.nextLine();
                    Product productByName = inventory.searchProductByName(name);
                    System.out.println(productByName != null ? productByName : "Product not found.");
                    break;
                case 5:
                    inventory.sortByName();
                    System.out.println("Products sorted by name.");
                    break;
                case 6:
                    inventory.sortByPrice();
                    System.out.println("Products sorted by price.");
                    break;
                case 7:
                    inventory.sortByQuantity();
                    System.out.println("Products sorted by quantity.");
                    break;
                case 8:
                    inventory.displayInventory();
                    break;
                case 9:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}