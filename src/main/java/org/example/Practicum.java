package org.example;

public class Practicum {
    // Task 1 of 5
    // Программа не работает — мы пытаемся обратиться к объекту, но он ещё не создан. Исправьте это.
    // Task 2 of 5
    // Хотим знать о хомяке больше: добавьте информацию о нём — возраст (англ. age), вес (англ. weight) и цвет (англ. color).
    public static void main(String[] args) {
        Hamster homka = new Hamster();

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
}
