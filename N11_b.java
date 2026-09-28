//Автор: Федурин Никита Иннокентьевич
//Задача №11_b
//пакеты позволяют ограничить классы логически в наборы, позволяет избежать ошибок между именами классов
package MyCompany;

//подключение типа (класса) для чтения данных с клавиатуры
import java.util.Scanner;

//Обьявление класса, в Java всё находить внутри классо.
//public - значит класс доступен извне, "N11_b" - имя класса,должна совпадать в именем файла
public class N11_b {

    //писать нужно именно в главном файле так как он вызываеться первым
    //Функция вывода справки по использованию программы
    static void printHelp(){
        System.out.println("Использование: java MyCompany.N11_b.java [-h | --help]");
        System.out.println();
        System.out.println("Программа вычисляет значения a и b по формулам:");
        System.out.println("  a = (3 + e^(y-1)) / (1 + x^2 * |y - tan(z)|)");
        System.out.println("  b = 1 + |y - x| + (y - x)^2 / 2 + |(y - x)^3| / 3");
        System.out.println();
        System.out.println("При запуске без флагов программа запросит с клавиатуры");
        System.out.println("три вещественных числа x, y, z (через пробел или Enter).");
        System.out.println();
        System.out.println("Флаги:");
        System.out.println("  -h, --help   вывести это сообщение и завершить работу");
    }

    //Главный метод, String[] args - массив строк, переданных при запуске программы
    public static void main(String[] args) {

        //проходим по всем аргументам командной строки
        for (String arg : args) {
            //если среди них есть -h или --help
            if (arg.equals("-h") || arg.equals("--help")) {
                printHelp(); //выводим справку
                return;//завершаем, можно return заменить на break и программа продолжиться
            }
        }

        //добавляем проверку assert из модуля
        //если модуль содержиться в том же пакете что и класс то его можно добавлять и использовать напрямую
        CustomMath.test_a();
        CustomMath.test_b();

        //Создание обьекта для ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        //println - выводит значение и переводит курсор на новую строку
        System.out.println("Введите значения x, y, z:");

        //ОбЪект in, отвечает за чтение данных
        //.nextDouble() - специальный метод класса Scanner, который заставляет программу останавливаться, ждать, пока пользователь не введет число и не нажмет Enter
        //затем преобразует ввод в тип double
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        //локальные переменные типа double в которых инициализируются функции
        //можно подключать модули и использовать их функции если модуль содержиться в том же пакете что и класс
        double a = CustomMath.calc_a(x, y, z);
        double b = CustomMath.calc_b(x, y);
        
        //printf - форматированный вывод как в с
        System.out.printf("\nОтвет:\na = %.3f;\nb = %.3f\n", a, b);
    }

}