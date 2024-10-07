package PR3.Ex2;

import io.reactivex.Observable;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(1001); // Случайное количество чисел от 0 до 1000

        Observable<Integer> source = Observable.range(0, count); // Создаем поток

        source.subscribe(System.out::println); // Печатаем каждый элемент
    }
}
