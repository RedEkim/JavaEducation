package org.example;

public class Practicum {
    // Task 1 of 5
    // Программа не работает — мы пытаемся обратиться к объекту, но он ещё не создан. Исправьте это.
    public static void main(String[] args) {
        Hamster homka = new Hamster();

        System.out.println("Имя: " + homka.name);
    }
}
