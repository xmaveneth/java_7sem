package PR3.Ex2;

import io.reactivex.Observable;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Создаем два потока с 1000 случайных чисел
        Observable<Integer> stream1 = Observable.range(0, 1000)
                .map(i -> random.nextInt(10)); // Случайные цифры в первом потоке

        Observable<Integer> stream2 = Observable.range(0, 1000)
                .map(i -> random.nextInt(10)); // Случайные цифры во втором потоке

        // Объединяем потоки и обрабатываем их параллельно
        Observable<Integer> mergedStream = Observable.zip(stream1, stream2, (num1, num2) -> num1 + num2); // Суммируем

        mergedStream.subscribe(System.out::println); // Печатаем каждый элемент
    }
}
