package org.example;

public class MainPark {
    public static void main(String[] args) {
        // Создаём парк
        Park park = new Park("Центральный парк");

        // Создаём аттракционы через внутренний класс
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 350);
        park.addAttraction("Американские горки", "11:00 - 20:00", 450);
        park.addAttraction("Комната страха", "12:00 - 21:00", 250);

        // Выводим информацию
        park.printParkInfo();
    }
}
