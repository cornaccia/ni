import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymbolText {


    public static void main(String[] args) {
        String line = "qwerty asdfg zxcvb asdfg"; //задаем переменную line
        // char symbol = 'a';     //переменная символ которой присваиваем букву а
        int bukva = 0;         //создаем счетчик, называем его bukva, считаем с 0
        for (char bukvaIzStroki : line.toCharArray()) {
            // цикл, line.toCharArray - разбивает строку на массив символов.

            if (bukvaIzStroki == 'a') bukva++;  // каждый символ из массива
            // сравнивается с заданным символом. Если они совпадают увеличиваем счетчик.
        }
        System.out.println(bukva);
        Assertions.assertEquals(2, bukva, "Shit!!!");
    }
//  КАК НАПИСАТЬ ТЕСТ Я НЕ ДОГНАЛА!!


    //@Test
    //public void stroka (){
    // String line = "qwerty asdfg zxcvb asdfg";



    //Assertions.assertEquals(2, bukva, "Shit!!!");



}
