package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private final String parkName; // название парка

    List<Attraction> attractionList = new ArrayList<>(); // список аттракционов парка

    // Конструктор парка
    public Park(String parkName) {
        this.parkName = parkName;
    }

    // Внутренний класс — описывает один аттракцион
    public static class Attraction {
        String name;            // название аттракциона
        String workingHours;    // время работы
        double price;           // стоимость

        // Конструктор внутреннего класса
        private Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод выводит информацию об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }

    // Метод создаёт аттракцион парка
    public void addAttraction(String name, String workingHours, double price) {
        Attraction newAttraction = new Attraction(name, workingHours, price);
        attractionList.add(newAttraction);
    }

    // Метод выводит название парка
    public void printParkInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println();
        System.out.println("Аттракционы парка:");
        System.out.println();

        for (Attraction attraction : attractionList) {
            attraction.printInfo();
        }
    }
}
