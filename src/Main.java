public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double weightKG = 98; // вес в кг
        double heightM = 1.87; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", weightKG, heightM, bmi.calculate(weightKG, heightM));

        weightKG = 50; // вес в кг
        heightM = 1.3; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", weightKG, heightM, bmi.calculate(weightKG, heightM));

        weightKG = 77; // вес в кг
        heightM = 1.7; // рост в м
        System.out.printf("\n Масса: %s кг \n Рост: %s м \nИндекс массы тела: %s\n", weightKG, heightM, bmi.calculate(weightKG, heightM));
    }
}