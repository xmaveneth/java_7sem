package PR3.Ex1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;

import java.util.Random; // Импортируем Random

// Создаем класс для датчика CO2
class CO2Sensor extends Observable<Integer> {
    private final PublishSubject<Integer> subject = PublishSubject.create();
    private final Random random = new Random(); // Создаем экземпляр Random

    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        subject.subscribe(observer); // Создаем подписку на события датчика CO2
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                int co2 = random.nextInt(71) + 30; // Генерируем случайное значение CO2 от 30 до 100
                subject.onNext(co2); // Отправляем значение CO2 подписчикам
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(); // Запускаем поток для симуляции работы датчика
    }
}
