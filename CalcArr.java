package gitok;

//подключение типа (класса) для генерации случайного числа
import java.util.Random;

//объявление класса
public class CalcArr {

    //поля класса
    static double[] arr;
    static Random rnd;

    //заполнение массива случайными числами в диапазоне [-100.0 100.0]
    public static void random_arr() {
        //arr.length - свойство массива, которое возвращает количество его элементов
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextDouble(-100.0, 100.0);
        }
    }

    //вывод массива на экран пользователя
    public static void print_arr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%6.2f ", arr[i]);

            //каждые 5 цифр меняем строку
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        //перевод строки после вывода массива
        if (arr.length % 5 != 0) {
            System.out.println();
        }
    }

    //вычисление суммы квадратов
    public static double culc_arr() {
        //объявление переменной суммы типа double
        double sum = 0;
        //цикл вычисления последовательности а_1^2 + a_2^2 ... a_n^2
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);//запись каждого элемента последовательности к сумме
        }
        return sum;
    }
}