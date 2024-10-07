package PR3.Ex1;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(); // Создаем датчик температуры
        CO2Sensor co2Sensor = new CO2Sensor(); // Создаем датчик CO2
        Alarm alarm = new Alarm(); // Создаем сигнализацию

        temperatureSensor.subscribe(alarm); // Подписываем сигнализацию на датчик температуры
        co2Sensor.subscribe(alarm); // Подписываем сигнализацию на датчик CO2

        temperatureSensor.start(); // Запускаем датчик температуры
        co2Sensor.start(); // Запускаем датчик CO2

        try {
            Thread.sleep(10000); // Запуск системы на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
