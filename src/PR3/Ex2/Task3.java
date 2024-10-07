package PR3.Ex2;


import io.reactivex.Observable;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(1000); // Случайное количество чисел от 0 до 1000

        Observable<Integer> source = Observable.range(0, count)
                .map(i -> random.nextInt(100)); // Генерируем случайные числа

        // Получаем только последний элемент
        source.lastElement()
                .subscribe(System.out::println, Throwable::printStackTrace); // Печатаем последний элемент
    }
}
