public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double a = 98; // вес в кг
        double b = 1.87; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", a, b, bmi.calculate(a, b));

        a = 50; // вес в кг
        b = 1.3; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", a, b, bmi.calculate(a, b));

        a = 77; // вес в кг
        b = 1.7; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", a, b, bmi.calculate(a, b));
    }
}