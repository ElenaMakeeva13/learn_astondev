package org.example;

public class Main {
    public static void main(String[] args) {
        // вначале объявляем массив объектов
        Product[] productsArray = new Product[5];

        // потом для каждой ячейки массива задаём объект
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599.99, true);

        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 4999.50, false);

        productsArray[2] = new Product("Xiaomi 15", "10.10.2024",
                "Xiaomi Corp.", "China", 3299.00, true);

        productsArray[3] = new Product("Philips 65OLED", "05.03.2025",
                "Philips", "Netherlands", 2799.99, false);

        productsArray[4] = new Product("Nokia 3310", "01.01.2000",
                "Nokia", "Finland", 99.99, false);

        // Проходим по массиву и выводим каждый товар
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("=== Товар №" + (i + 1) + " ===");
            productsArray[i].printInfo();
        }
    }
}