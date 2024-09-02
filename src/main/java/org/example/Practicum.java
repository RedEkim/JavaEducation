package org.example;

public class Practicum {
    // Task 1 of 5
    // Программа не работает — мы пытаемся обратиться к объекту, но он ещё не создан. Исправьте это.
    // Task 2 of 5
    // Хотим знать о хомяке больше: добавьте информацию о нём — возраст (англ. age), вес (англ. weight) и цвет (англ. color).
    // Task 3 of 5
    // Переменная называется homka, но хомяка все еще зовут Байт. Измените имя хомяка на Хомку, а заодно отредактируйте и другие атрибуты: пусть ему будет 1 год, он будет весить 420 грамм, а его цвет будет не рыжий, а чёрный.
    // Task 4 of 5
    // Хомка голодный! Покормите его с помощью метода eat. В качестве аргумента передайте число 15. После этого проверьте значение его веса снова, чтобы убедиться, что он поужинал.
    public static void main(String[] args) {
        Hamster homka = new Hamster();
        // Присвойте полям новые значения
        homka.name = "Хомка";
        homka.age = 1;
        homka.weight = 420;
        homka.color = "чёрный";

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);

        // Покормите хомяка и напечатайте его вес
        homka.eat(15);
        System.out.println("Новый вес: " + homka.weight);
    }
    public static class Hamster {

        // Поля
        String name = "Байт"; // Имя
        int age = 2; // Возраст
        String color = "Рыжий"; // Цвет
        int weight = 350; // Вес

        // Методы
        // Есть
        void eat(int foodWeight) {
            weight = weight + foodWeight;
        }

        // Бегать в колесе
        void runInWheel() {
            System.out.println("Бегу-бегу-бегу!");
            weight = weight - 5;
        }

        // Прятать семечки
        void hideSeeds(int seedWeight) {
            weight = weight + seedWeight;
            System.out.println("Зимой не заголодаю.");
        }
    }
}
