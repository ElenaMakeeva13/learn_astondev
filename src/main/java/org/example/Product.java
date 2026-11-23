package org.example;

public class Product {
    // Поля класса — характеристики каждого товара
    String name;                // название
    String productionDate;      // дата производства
    String manufacturer;        // производитель
    String country;             // страна происхождения
    double price;               // цена
    boolean reservation;           // состояние бронирования покупателем

    // Конструктор — заполняет все поля при создании объекта
    public Product(
            String name,
            String productionDate,
            String manufacturer,
            String country,
            double price,
            boolean reservation
    ) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.reservation = reservation;
    }

    // Метод выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (reservation ? "да" : "нет"));
        System.out.println(); // пустая строка между товарами, чтобы читалось легче
    }
}
