import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {

    public double calc(double number, double percent) { //создается функция calc с типом данных
        // double, на вход функция calc принимает две переменные number и percent. обе переменные
        // имеют тип данных double.
        return number*(percent/100); // возвращает результат функции calc.

    }

    public double car(double bak, double rasstoyanie) { // создается функция car с типом данных
        // double, на вход функция car принимает две переменные bak и rasstoyanie. Обе переменные
        // имеют тип данных double.
        return  bak/rasstoyanie*100; // возвращает результат функции car.
    }

    @Test
    public void showSum() {
        double result = calc(100, 5);
        Assertions.assertEquals(5, result, "Shit!!!");
    }

    @Test
    public void testCar() {
        double result = car(88, 903);
        System.out.println(Math.round(result));
        Assertions.assertEquals(10, Math.round(result), "Shit!!!");
    }


}