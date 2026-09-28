package MyCompany;

//объявление класса
public class CustomMath {

    //определение функции для подсчёта а по формуле
    //param_x - параметр х присутствующий в формуле
    //param_y - параметр y присутствующий в формуле
    //param_z - параметр z присутствующий в формуле
    public static double calc_a(double param_x, double param_y, double param_z){
        //возврат результата вычисленний по формуле
        //Класс Math содержит набор базовых математических операций, констант (например число ПИ, степень, модуль, екстанента)
        return (3 + Math.exp(param_y -1)) / (1 + Math.pow(param_x, 2.0) * Math.abs(param_y - Math.tan(param_z)));
    }

    //определение функции для подсчёта а по формуле
    //param_x - параметр х присутствующий в формуле
    //param_y - параметр y присутствующий в формуле
    public static double calc_b(double param_x, double param_y){
        //возврат результата вычислений по формуле
        return 1 + Math.abs(param_y - param_x) + ((Math.pow((param_y - param_x), 2.0)) / 2) + Math.abs(Math.pow((param_y - param_x), 3.0))/3;
    }

    //проверка assert на вычисление а
    static void test_a(){
        //a = (3 + e^(y-1)) / (1 + x^2 * |y - tan(z)|) если: x = 2, y = 1, z = 1 ответ: 1.2385316234464
        assert Math.abs(CustomMath.calc_a(2.0, 1.0, 1.0) - 1.2385316234464) < 1e-9:"Значение посчитанно не правильно при вычислении a";
        //a = (3 + e^(y-1)) / (1 + x^2 * |y - tan(z)|) если: x = 1, y = 2, z = 1 ответ: 3.9638932816905
        assert Math.abs(CustomMath.calc_a(1.0, 2.0, 1.0) - 3.9638932816905) < 1e-9;
        //a = (3 + e^(y-1)) / (1 + x^2 * |y - tan(z)|) если: x = 1, y = 1, z = 2 ответ: 0.955785400066103
        assert Math.abs(CustomMath.calc_a(1.0, 1.0, 2.0) - 0.955785400066103) < 1e-9;
    }

    //проверка assert на вычисление b
    static void test_b(){
        //b = 1 + |y - x| + (y - x)^2 / 2 + |(y - x)^3| / 3 если: x = 2, y = 1 ответ: 2.8333333333333335
        assert Math.abs(CustomMath.calc_b(2.0, 1.0) - 2.8333333333333335) < 1e-9:"Значение посчитанно не правильно при вычислении b";
        //b = 1 + |y - x| + (y - x)^2 / 2 + |(y - x)^3| / 3 если: x = 1, y = 2 ответ: 2.8333333333333335
        assert Math.abs(CustomMath.calc_b(1.0, 2.0) - 2.8333333333333335) < 1e-9;
        //b = 1 + |y - x| + (y - x)^2 / 2 + |(y - x)^3| / 3 если: x = 1, y = 1 ответ: 1.0
        assert CustomMath.calc_b(1.0, 1.0) == 1.0;
    }
}//проверка
