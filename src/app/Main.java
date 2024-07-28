package app;

public class Main {

    public static void main(String[] args) {

        //Ініціалізуємо та присвоюємо значення змінній лічильника
        //Ініціалізуємо та присвоюємо значення змінній,
        //яка буде рахувати суму чисел кожного рядку
        int count = 0;
        int sum = 0;

        for (int number = 1; number <= 6; number++){
            count++; //Нумеруємо кожен рядок через інкремент
            sum += number; //Рахуємо суму чисел наростаючим підсумком
            System.out.println(count + ") Num is " + number + ", sum is " + sum);
        }
        System.out.println("------------------------\n" +
                "Sum of numbers is " + sum);
    }
}
