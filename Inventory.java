/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author Lenovo
 */
import java.util.Arrays;
 
public class Inventory {
    private Product[] products;
    private int size;
 
    public Inventory(int capacity) {
        products = new Product[capacity];
        size = 0;
    }
 
    public void addProduct(int id, String name, double price, int quantity) {
        if (size == products.length) {
            products = Arrays.copyOf(products, products.length * 2);
        }
        products[size++] = new Product(id, name, price, quantity);
    }
 
    public void removeProduct(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId() == id) {
                products[i] = products[--size];
                products[size] = null;
                return;
            }
        }
    }
 
    public Product searchProductById(int id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        return null;
    }
 
    public Product searchProductByName(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }
 
    public void sortByName() {
        Arrays.sort(products, 0, size, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }
 
    public void sortByPrice() {
        Arrays.sort(products, 0, size, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
 
    public void sortByQuantity() {
        Arrays.sort(products, 0, size, (p1, p2) -> Integer.compare(p1.getQuantity(), p2.getQuantity()));
    }
 
    public void displayInventory() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}
