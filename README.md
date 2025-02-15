
# 📦 Java Inventory Management System  

This project is a simple **Inventory Management System** implemented in **Java** using either **arrays** or **linked lists**. It allows users to manage product information efficiently, ensuring accurate stock tracking through various operations such as adding, removing, searching, and sorting products.  

---

## 🚀 Features  

✅ **Add Product** – Add new products with details like **ID, name, price, and quantity**.  
✅ **Remove Product** – Delete a product from inventory using **ID or name**.  
✅ **Search Product** – Find products based on **ID or name (partial match supported)**.  
✅ **Sort Products** – Organize inventory by **name, price, or quantity**.  

---

## 🛠️ Data Structure Options  

You can choose to implement the system using:  

- **Array**: Stores product details in a fixed-size array of `Product` objects.  
- **Linked List**: Uses a **singly or doubly linked list** to dynamically manage inventory.  

Each **Product** object contains:  
📌 `productID` (Unique identifier)  
📌 `name`  
📌 `price`  
📌 `quantity`  

---

## 📂 Project Structure  

```
📁 Java-InventoryManagementSystem
 ├── 📄 InventorySystem.java      # Main inventory management class
 ├── 📄 Product.java              # Product class with attributes and methods
 ├── 📄 InventoryArray.java       # Implementation using arrays
 ├── 📄 InventoryLinkedList.java  # Implementation using linked lists
 ├── 📄 README.md                 # Project documentation
 ├── 📄 LICENSE                   # License file
```

---

## 📌 Functionalities  

### 🔹 **1. Add Product**  
- Prompt user for **name, price, and quantity**.  
- Create a new `Product` object.  
- Store the object in an **array or linked list**.  

### 🔹 **2. Remove Product**  
- Allow removal based on **Product ID or Name**.  
- Locate and delete the product from inventory.  

### 🔹 **3. Search Product**  
- Find a product using **ID** or **name** (supports partial match).  

### 🔹 **4. Sort Products**  
- **Alphabetically** by name 📄  
- **By price** (ascending/descending) 💲  
- **By quantity** (low to high / high to low) 📊  

---

## 🏗️ Installation & Usage  

1️⃣ **Clone the Repository**  
```sh
git clone https://github.com/yourusername/Java-InventoryManagementSystem.git
cd Java-InventoryManagementSystem
```

2️⃣ **Compile & Run the Code**  
```sh
javac InventorySystem.java
java InventorySystem
```

3️⃣ **Follow the On-Screen Menu** to **Add, Remove, Search, and Sort** products.  

---

## 📜 License  

This project is licensed under the **MIT License**.  

---

## 🤝 Contributions  

Contributions are welcome! Feel free to submit a **pull request** or open an **issue**.  
