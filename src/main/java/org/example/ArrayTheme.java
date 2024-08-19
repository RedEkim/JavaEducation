package org.example;
import java.util.Scanner;
import java.util.Random;
public class ArrayTheme {
    public static void main(String[] args) {
        // Массивы: что это такое?
        // Расходы за неделю
        /*
        double mondayExpense = 100.50;
        double tuesdayExpense = 500.00;
        double wednesdayExpense = 10.00;
        double thursdayExpense = 0.0;
        double fridayExpense = 40.60;
        double saturdayExpense = 500.10;
        double sundayExpense = 200.00;
        */

        // Объявите массив expenses и соберите в него значения из переменных
        /*Double[] expenses = {mondayExpense, tuesdayExpense, wednesdayExpense, thursdayExpense, fridayExpense, saturdayExpense, sundayExpense};
        System.out.println(expenses);
        */
        // Учимся работать с массивами: индексы и элементы
        /* Задача 1 из 3
        Перед вами массив трат за неделю. Каждый его элемент — это сумма, потраченная за один день, от понедельника до воскресенья. Сделайте следующее:
            Исправьте сумму расходов за среду: в ней не отражено мороженое, купленное за 115 рублей. Прибавьте стоимость десерта к расходам за день.
            Суммируйте три самые крупные траты в массиве — это расходы за вторник, пятницу и субботу. Результат сохраните в переменную sum.
        */
        // double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // Добавьте 115 рублей к расходам за среду
        /* expenses[2] += 115;
        System.out.println("Новое значение расходов за среду: " + expenses[2] + " рублей.");
        */

        // Суммируйте три самые крупные траты
        /* Double sum = expenses[1] + expenses[4] + expenses[5];
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + sum + " рублей.");
        */

        /* Задача 2 из 3
        Ваш коллега запланировал на год дюжину классных целей и составил из них список в порядке приоритетности. Однако сразу после новогодних каникул планы изменились. Командировка в Китай отложена на весну, а вот диван нужен срочно — в гости приедут друзья. Поездка в Японию вообще сорвалась — решено отдыхать в Сочи.
        Вам нужно помочь коллеге объявить массив для его планов и внести в него изменения: поменять местами поездку в Китай и покупку дивана, а отпуск в Японии заменить отпуском в Сочи. Изменения в планах напечатайте, используя их порядковые номера в списке.
         */
        // На месте многоточия объявите массив plans
        /*String[] plans = {"Поехать в Китай по работе",
                "Отметить день рождения с друзьями",
                "Обустроить рабочее место",
                "Научиться вести бюджет",
                "Купить диван",
                "Поехать на музыкальный фестиваль",
                "Попросить на работе один удалённый день в неделю",
                "Заняться спортом",
                "Поехать в Японию в отпуск",
                "Начать внедрять zero waste-подходы в повседневную жизнь",
                "Встречаться с друзьями не реже раза в неделю",
                "Перестать есть в кровати"
        };
        */
        // Поменяйте местами покупку дивана и поездку в Китай в три шага, используя swap
        /*
        String swap = plans[0]; // Присвойте swap значение элемента, который вы заменяете
        plans[0] = plans[4] ; // Присвойте значение одного элемента другому
        plans[4] = swap; // В swap должно оказаться значение элемента, выбранного на замену
        */

        // Замените фразу "Поехать в Японию в отпуск" на "Поехать в Сочи в отпуск"
        /*
        plans[8] = "Поехать в Сочи в отпуск";

        System.out.println("Изменения в планах:");
        System.out.println("1. " + plans[0]);
        System.out.println("5. " + plans[4]);
        System.out.println("9. " + plans[8]);
        */
        // Задача 3 из 3
        /*
        Банк разрабатывает для своих клиентов валютный кошелёк для путешествий. Базово в нём собраны всё те же четыре валюты: доллары, евро, иены и рубли. Однако в зависимости от того, в какую страну отправляется клиент банка, валюты можно будет менять. Пока доступных опций немного: при поездке в Данию евро можно поменять на кроны, а при поездке в Китай иены на юани. Допишите программу таким образом, чтобы она сначала спрашивала у пользователя, куда он планирует отправиться, в Данию или Китай, и в зависимости от выбора варианта меняла валюту в базовом наборе кошелька. Используйте конструкцию с условным выражением.
        */
//        String[] currencies = {"USD","EUR","JPY","RUB"};
//
//        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
//        System.out.println(currencies[0]);
//        System.out.println(currencies[1]);
//        System.out.println(currencies[2]);
//        System.out.println(currencies[3]);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Если вы планируете поездку в Данию, введите 1, а если в Китай, введите 2");

        //int country = scanner.nextInt();  // Считайте из консоли ввод пользователя

//        if(country == 1) { // Если выбрана Дания, измените значение элемента евро на кроны DKK
//            currencies[1] = "DKK";
//        } else if(country == 2) { // Если Китай, измените значение элемента иена на юани CNY
//            currencies[2] = "CNY";
//        }

//        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
//        System.out.println(currencies[0]);
//        System.out.println(currencies[1]);
//        System.out.println(currencies[2]);
//        System.out.println(currencies[3]);

        // Взаимодействуем с массивом через консоль
        // Задача 1 из 3
        /*
        Вы продолжаете работать с массивом валют. В коде отражено, что пользователь может выбрать любую из валют, а затем сообщить программе свой выбор. Это происходит с помощью индексов элементов. Пользователю сообщаются индексы и предлагается ввести номер того, который соответствует валюте, которую он хочет заменить. Потом программа присваивает элементу с этим индексом новое значение. Запустите код несколько раз и попробуйте поменять базовые валюты на любые другие.
        */
//        String[] currencies = {"USD", "EUR", "JPY", "RUB"};
//        System.out.println("Валюты в вашем портфеле:");
//        System.out.println(currencies[0] + " - индекс 0"); // Печатаем валюты и их индексы
//        System.out.println(currencies[1] + " - индекс 1");
//        System.out.println(currencies[2] + " - индекс 2");
//        System.out.println(currencies[3] + " - индекс 3");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите индекс валюты, которую хотите поменять:");
//        int index = scanner.nextInt(); // Даём возможность ввести индекс выбранной валюты
//
//        System.out.println("Выберите новую валюту:");
//        String currency = scanner.next(); // Даём возможность ввести новое значение валюты
//
//        String previousCurrency = currencies[index]; // Сохраняем старое значение
//        currencies[index] = currency; // Присваиваем выбранному элементу новое значение
//
//        System.out.println("Мы заменили " + previousCurrency + " на: " + currencies[index]);
//
//        System.out.println("Теперь в вашем портфеле такие валюты:");
//        System.out.println(currencies[0]);
//        System.out.println(currencies[1]);
//        System.out.println(currencies[2]);
//        System.out.println(currencies[3]);
        // Задача 2 из 3
        /*
        Перед вами массив расходов за неделю — вы уже работали с подобным. Сделайте процесс редактирования трат более удобным: добавьте в код возможность менять сумму расходов за любой день через консоль. Сначала у пользователя должна быть возможность ввести индекс траты, которую он хочет изменить, а потом её новое значение. Переменную для индекса назовите index, а переменную для новой суммы расходов — newExpense.
        */
//        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00};
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Расходы за неделю хранятся под индексами от 0 (пн) до 6 (вс).");
//        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");
//
//        // Объявите переменную, которая будет хранить индекс выбранного элемента
//        int index = scanner.nextInt();
//
//        System.out.println("Введите новую сумму трат за этот день:");
//        // Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
//        Double newExpense = scanner.nextDouble();
//
//        // Замените значение элемента с нужным индексом на новое
//        expenses[index] = newExpense;
//        System.out.println("За день с индексом " + index + " размер трат теперь " + expenses[index] );
        // Задача 3 из 3
        /*
        Жюри кулинарного конкурса предложено продегустировать пять блюд в таком порядке: ризотто, тартар, шурпа, панна-котта и сашими. Для определения победителя разработана новая гибкая система оценки. У каждого из членов жюри есть возможность поменять два блюда местами в исходном списке (как при дегустации). Например, поставить сашими на первое место, если оно понравилось больше всего — ризотто в таком случае отправится на пятое место.
Напишите программу, которая позволит менять блюда местами. У пользователя (члена жюри) должна быть возможность выбрать любое блюдо, а потом указать любой номер позиции, на которую он хочет его поставить.
        */
//        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
//        System.out.println("Вы продегустировали пять блюд.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите индекс блюда, которое хотите переместить:");
//        System.out.println("0-Ризотто");
//        System.out.println("1-Тартар");
//        System.out.println("2-Шурпа");
//        System.out.println("3-Панна-котта");
//        System.out.println("4-Сашими");
//
//        // Считайте из консоли индекс блюда, которое нужно переместить
//        int firstIndex = scanner.nextInt();
//
//        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
//        // Объявите переменную secondIndex для нового положения (индекса) блюда, считайте его из консоли
//        int secondIndex = scanner.nextInt();
//
//        // Сохраните значение блюда под индексом firstIndex в переменную swap
//        String swap = dishes[firstIndex];
//
//        // Присвойте блюду с индексом firstIndex значение блюда под индексом secondIndex
//        dishes[firstIndex] = dishes[secondIndex];
//
//        // Присвойте блюду с индексом secondIndex значение переменной swap
//        dishes[secondIndex] = swap;
//
//        System.out.println("Ваш рейтинг блюд:");
//        System.out.println(dishes[0]);
//        System.out.println(dishes[1]);
//        System.out.println(dishes[2]);
//        System.out.println(dishes[3]);
//        System.out.println(dishes[4]);
        // Знакомимся с длиной массива
        // Задача
        /*
            В банке решили разработать приложение, которое поможет менеджерам проводить ипотечные сделки. Сначала банковский работник должен указать участников сделки, потом загрузить их документы, подтверждающие личность. Программа отслеживает, что документы каждого из клиентов сохранены в базе.
            Сейчас менеджер проводит сделку для семьи из трёх человек: Петра, Надежды и их сына Валентина, они объединены в массиве participants. Пётр планирует предоставить в качестве удостоверения личности паспорт, Надежда — водительское удостоверение, а для оформления Валентина потребуется свидетельство о рождении.
            Допишите программу таким образом, чтобы в случае, если банковский работник ошибся и загрузил неправильное количество документов, выдавалось предупреждение об ошибке. Для этого вам потребуется создать второй массив для документов documents, получить длины обоих массивов и сопоставить их.
        */
        // Создайте и заполните массив именами участников сделки
//        String[] participants = {"Петр", "Надежда", "Валентин"};
//        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
//        String[] documents = {"Паспорт", "Водительское удостоверение", "Свидетельство о рождении"};
//
//        // Проверьте количество документов, оно должно быть равно числу участников
//        if (documents.length == participants.length) {
//            System.out.println("Документы загружены верно. Список документов:");
//            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
//            System.out.println(participants[0] + ": " + documents[0]);
//            System.out.println(participants[1] + ": " + documents[1]);
//            System.out.println(participants[2] + ": " + documents[2]);
//        } else {
//            /* Для ошибки предусмотрите печать такого сообщения:
//						 "Количество документов не соответствует количеству участников сделки." */
//            System.out.println("Количество документов не соответствует количеству участников сделки.");
//        }
        // Массивы и циклы
        // Задача
        /*
            Заполните массив трат за неделю — expenses, используя цикл for. Расходы за каждый день будут определяться случайным образом с помощью генератора Random с ограничением в 1000. После заполнения массива напечатайте значения его элементов и посчитайте сумму трат за неделю — также с помощью циклов.
        */
        // Объявите пустой массив трат за неделю (7 дней)
//        int[] expenses = new int[7];
//
//        Random random = new Random(); // Генерирует случайное число
//
//        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
//        for (int i = 0; i < expenses.length; i++) {
//            expenses[i] = random.nextInt(1000);
//        }
//
//        System.out.println("Траты за неделю:");
//        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
//        for(int i = 0; i < expenses.length; i++) {
//            System.out.println("День " + (i + 1) + ". Потрачено рублей: " + expenses[i]);
//        }
//
//        int sum = 0;
//        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
//        for(int i = 0; i < expenses.length; i++) {
//            sum += expenses[i];
//        }
//
//        System.out.println("Траты в рублях за неделю: " + sum);
        // Выход за границы массива
        // Задача 1 из 2
        /*
        Изучите код программы, которая автоматически заполняет массив расходов за неделю. Найдите и исправьте допущенные ошибки.
        */
//        double[] expenses = new double[7]; // Объявили массив трат за неделю (7 дней)
//
//        double expense = 50; // В первый день потрачено 50 рублей
//
//        // Заполнили массив, используя цикл for
//        for (int i = 0; i < expenses.length; i++) {
//            expenses[i] = expense;
//            expense = expense + 100;
//        }
//        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
        // Задача 2 из 2
        /*
        После того как вы нашли и исправили все ошибки, программа по автозаполнению массива с расходами за неделю работает правильно. Допишите её таким образом, чтобы у пользователя появилась возможность это проверить — вызвать любой элемент массива по его индексу. Исключите ошибки выхода за границы массива — настройте ответ программы на тот случай, если пользователь введёт несуществующий индекс. Чтобы можно было ошибаться много раз — мы добавили в код бесконечный цикл. Прервите его выполнение с помощью оператора break в том случае, если введён корректный индекс.
        */
        // Объявили массив трат за неделю (7 дней)
//        double[] expenses = new double[7];
//
//        double expense = 50; // В первый день потрачено 50 рублей
//
//        // Заполнили массив, используя цикл for
//        for (int i = 0; i < expenses.length; i++) {
//            expenses[i] = expense;
//            expense = expense + 100;
//        }
//        System.out.println("Расходы за неделю успешно занесены в приложение!");
//        Scanner scanner = new Scanner(System.in);
//        while (true) { // Добавили бесконечный цикл — теперь не страшно ошибаться много раз
//            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");
//
//            // Считайте ввод пользователя из консоли и сохраните в переменной index
//            int index = scanner.nextInt();
//
//            // Проверьте, не допущена ли ошибка
//            if(index < 0) {
//                // Если значение меньше нуля,
//                // напечатайте "Выбрано неверное значение! Минимальное значение - 0"
//                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
//            } else if(index >= expenses.length) {
//                // Если выбрано значение больше длины массива или равное ей,
//                // напечатайте "Выбрано неверное значение! Максимальное значение - " + ...
//                System.out.println("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
//            } else {
//                // Если пользователь ввёл корректный индекс,
//                // то программа должна вывести значение нужного элемента и завершить работу (прервать цикл)
//                System.out.println("Потрачено " + expenses[index] + " рублей");
//                break;
//            }
//        }
        // Добавляем операции с тратами в приложение
        // Задача 1 из 4
        // Ниже объявите пустой массив expenses для записи трат за неделю
//        double[] expenses = new double[7];
//
//        double rateUSD = 78.5;
//        double rateEUR = 85;
//        double rateJPY = 0.74;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            System.out.println("Что вы хотите сделать?");
//            System.out.println("1 — Конвертировать валюту");
//            System.out.println("2 — Получить совет");
//            System.out.println("3 — Ввести трату");
//            System.out.println("0 — Выход");
//
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                if (currency == 1) {
//                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
//                } else if (currency == 2) {
//                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
//                } else if (currency == 3) {
//                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
//                } else {
//                    System.out.println("Неизвестная валюта");
//                }
//            } else if (command == 2) {
//                if (moneyBeforeSalary < 3000) {
//                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                } else if (moneyBeforeSalary < 10000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Окей, пора в Макдак!");
//                    } else {
//                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                    }
//                } else if (moneyBeforeSalary < 30000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    } else {
//                        System.out.println("Окей, пора в Макдак!");
//                    }
//                } else {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Отлично! Заказывайте крабов!");
//                    } else {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    }
//                }
//            } else if (command == 3) { // Ещё одно ветвление для обработки новой команды, допишите его условие
//                // Допишите код для печати сообщения для пользователя
//                // Текст сообщения: "За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?"
//                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
//                // Получите из консоли день, за который пользователь хочет указать расходы
//                int day = scanner.nextInt();
//                System.out.println("Введите размер траты:");
//                // Получите из консоли значение расходов и сохраните в переменной expense
//                double expense = scanner.nextDouble();
//                // Сохраните полученное значение дневных трат в массив expenses
//                // Не забудьте прибавить новое значение к уже существующим тратам
//                expenses[day-1] += expense;
//                System.out.println("Значение сохранено!");
//
//            } else if (command == 0) {
//                System.out.println("Выход");
//                break;
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
        // Задача 2 из 4
//        Доработайте код приложения. При внесении новой траты баланс на счёте должен уменьшаться на эту же сумму. Для этого внесите изменения в ветвление третьей команды. После того как пользователь ввёл свои расходы за определённый день, вычтите их значение из общей суммы сбережений и только потом занесите его в массив. Напечатайте актуальный баланс в строке «Значение сохранено! Ваш текущий баланс в рублях: ...». В случае, когда значение баланса опустится ниже 1000 рублей, должно появляться предупреждение: «На вашем счету осталось совсем немного. Стоит начать экономить!»
//        double[] expenses = new double[7];
//
//        double rateUSD = 78.5;
//        double rateEUR = 85;
//        double rateJPY = 0.74;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            System.out.println("Что вы хотите сделать?");
//            System.out.println("1 — Конвертировать валюту");
//            System.out.println("2 — Получить совет");
//            System.out.println("3 — Ввести трату");
//            System.out.println("0 — Выход");
//
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                if (currency == 1) {
//                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
//                } else if (currency == 2) {
//                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
//                } else if (currency == 3) {
//                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
//                } else {
//                    System.out.println("Неизвестная валюта");
//                }
//            } else if (command == 2) {
//                if (moneyBeforeSalary < 3000) {
//                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                } else if (moneyBeforeSalary < 10000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Окей, пора в Макдак!");
//                    } else {
//                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                    }
//                } else if (moneyBeforeSalary < 30000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    } else {
//                        System.out.println("Окей, пора в Макдак!");
//                    }
//                } else {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Отлично! Заказывайте крабов!");
//                    } else {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    }
//                }
//            } else if (command == 3) {
//                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
//                int day = scanner.nextInt();
//                System.out.println("Введите размер траты:");
//                double expense = scanner.nextDouble();
//
//                moneyBeforeSalary -= expense; // Уменьшите баланс на сумму введённой траты
//                expenses[day - 1] += expense;// Сохраните трату в массив
//
//                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
//
//                if (moneyBeforeSalary < 1000) { // Проверьте текущее значение баланса — не опустилось ли оно ниже отметки в 1000 рублей
//                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");// Выведите предупреждение: "На вашем счету осталось совсем немного. Стоит начать экономить!"
//                }
//
//            } else if (command == 0) {
//                System.out.println("Выход");
//                break;
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
        // Задача 3 из 4
        // Финансовое приложение теперь умеет записывать траты и выводить предупреждение о недостатке средств на счету. Однако узнать, сколько денег вы в итоге потратили в каждый из дней, не получится. Это неудобно. Доработайте функционал приложения таким образом, чтобы можно было легко получить список всех расходов за неделю с разбивкой по дням.
        //Добавьте в приложение новую команду «4 - Показать траты за неделю».
        //Напишите новое ветвление для обработки четвёртой команды. Получив её, программа должна выводить все траты за неделю в формате День _. Потрачено _ рублей.. Нумерация дней должна быть от 1 до 7.
        //Для печати трат используйте цикл for.
//        double[] expenses = new double[7];
//
//        double rateUSD = 78.5;
//        double rateEUR = 85;
//        double rateJPY = 0.74;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            System.out.println("Что вы хотите сделать?");
//            System.out.println("1 - Конвертировать валюту");
//            System.out.println("2 - Получить совет");
//            System.out.println("3 - Ввести трату");
//            // Допишите новый пункт цифрового меню
//            System.out.println("4 - Показать траты за неделю");
//            System.out.println("0 - Выход");
//
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                if (currency == 1) {
//                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
//                } else if (currency == 2) {
//                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
//                } else if (currency == 3) {
//                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
//                } else {
//                    System.out.println("Неизвестная валюта");
//                }
//            } else if (command == 2) {
//                if (moneyBeforeSalary < 3000) {
//                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                } else if (moneyBeforeSalary < 10000){
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Окей, пора в Макдак!");
//                    } else {
//                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                    }
//                } else if (moneyBeforeSalary < 30000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    } else {
//                        System.out.println("Окей, пора в Макдак!");
//                    }
//                } else {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Отлично! Заказывайте крабов!");
//                    } else {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    }
//                }
//            } else if (command == 3) {
//                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
//                int day = scanner.nextInt();
//                System.out.println("Введите размер траты:");
//                double expense = scanner.nextDouble();
//                moneyBeforeSalary = moneyBeforeSalary - expense;
//                expenses[day - 1] = expenses[day - 1] + expense;
//                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
//                if (moneyBeforeSalary < 1000) {
//                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
//                }
//            } else if(command == 4)  {
//                for(int i=0; i < expenses.length; i++) {
//                    System.out.println("День " + (i+1) +". Потрачено " + expenses[i] + " рублей." );
//                }
//            }// Добавьте ветвление для обработки новой команды
//            // Используйте цикл for, чтобы получить все траты — элементы массива expenses
//            // Напечатайте в цикле строку: "День _. Потрачено _ рублей.".
//
//        else if (command == 0) {
//            System.out.println("Выход");
//            break;
//        } else {
//            System.out.println("Извините, такой команды пока нет.");
//        }
//    }
        // Задача 4 из 4
        // Благодаря вам финансовое приложение умеет записывать и выводить траты. Научите его ещё и анализировать их — печатать не все сразу, а только одну — самую крупную. Для этого внесите в код такие изменения:
        //Добавьте в меню ещё одну команду «5 — Показать самую большую сумму расходов за неделю». В тело программы допишите дополнительное ветвление для её обработки.
        //При выполнении новой команды приложение должно найти в массиве расходов за неделю самое большое значение и вывести его на экран. Для этого сначала создайте дополнительную переменную maxExpense со стартовым значением 0. Затем с помощью цикла for сравните maxExpense со всеми элементами массива. Если значение элемента больше, сохраняйте его в переменной maxExpense — так она будет всё время перезаписываться и после завершения цикла в ней окажется нужная вам самая крупная сумма расходов. Напечатайте её в строке «Самая большая сумма расходов на этой неделе составила ... руб.».
//        double[] expenses = new double[7];
//
//        double rateUSD = 78.5;
//        double rateEUR = 85;
//        double rateJPY = 0.74;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            System.out.println("Что вы хотите сделать?");
//            System.out.println("1 - Конвертировать валюту");
//            System.out.println("2 - Получить совет");
//            System.out.println("3 - Ввести трату");
//            System.out.println("4 - Показать траты за неделю");
//            // Допишите вывод нового пункта меню
//            System.out.println("5 — Показать самую большую сумму расходов за неделю");
//            System.out.println("0 - Выход");
//
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                if (currency == 1) {
//                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
//                } else if (currency == 2) {
//                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
//                } else if (currency == 3) {
//                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
//                } else {
//                    System.out.println("Неизвестная валюта");
//                }
//            } else if (command == 2) {
//                if (moneyBeforeSalary < 3000) {
//                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                } else if (moneyBeforeSalary < 10000){
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Окей, пора в Макдак!");
//                    } else {
//                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
//                    }
//                } else if (moneyBeforeSalary < 30000) {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    } else {
//                        System.out.println("Окей, пора в Макдак!");
//                    }
//                } else {
//                    if (daysBeforeSalary < 10) {
//                        System.out.println("Отлично! Заказывайте крабов!");
//                    } else {
//                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
//                    }
//                }
//            } else if (command == 3) {
//                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
//                int day = scanner.nextInt();
//                System.out.println("Введите размер траты:");
//                double expense = scanner.nextDouble();
//                moneyBeforeSalary = moneyBeforeSalary - expense;
//                expenses[day - 1] = expenses[day - 1] + expense;
//                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
//                if (moneyBeforeSalary < 1000) {
//                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
//                }
//            } else if (command == 4) {
//                for (int i = 0; i < expenses.length; i++) {
//                    System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
//                }
//            } else if (command == 5) { // Добавьте условие в ветвление для обработки новой команды
//                /* Объявляем переменную maxExpense для хранения самой большой суммы расходов.
//                   Сначала её значение неизвестно, поэтому равно нулю */
//                double maxExpense = 0;
//                for (int i = 0; i < expenses.length; i++) { // Проходим циклом по всему массиву трат
//                    if (expenses[i] > maxExpense) { // Сравниваем, больше ли текущий элемент массива значения maxExpense
//                        // Если условие верно, то записываем в maxExpense значение текущего элемента массива
//                        maxExpense = expenses[i];
//                    }
//                }
//                // Печатаем максимум расходов:
//                System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
//
//            } else if (command == 0) {
//                System.out.println("Выход");
//                break;
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
        // Методы
        // Объявляем методы
        // Задача
        System.out.println("Робот-помощник v1.0.");
    }

    public static void welcomeUserByName() { // Объявите метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() { // Объявите метод sayHelloByTime
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?"); // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        int currentHour = scanner.nextInt(); // В зависимости от времени предусмотрите печать приветствий
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }

    public static void printSuccess() { // Объявите метод printSuccess
        System.out.println("У вас уже неплохо получается программировать!"); // Он должен печатать строку: У вас уже неплохо получается программировать!
    }
}

