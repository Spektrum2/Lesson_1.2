public class Main {
    public static void main(String[] args) {
        task5();
    }
    public static void task1(){
        byte a1 = 1;
        short b1 = 2;
        int c1 = 3;
        long d1 = 4;
        float e1 = 5.5f;
        double f1 = 4.678;
        char g1 = 126;
        boolean h1 = 10>5;
    }
    public static void task2(){
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float commonWeight = boxerOneWeight + boxerTwoWeight;
        float differenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Общий вес двух бойцов " + commonWeight);
        System.out.println("Разница между весами бойцов " + differenceWeight);
    }
    public static void task3(){
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int bananasGram = bananas * 80;
        int milkGram = milk / 100 * 105;
        int iceCreamGram = iceCream * 100;
        int eggsGram = eggs * 70;
        float WeightAll = bananasGram + milkGram + iceCreamGram + eggsGram;
        float kg = WeightAll / 1000;
        System.out.println("Вес спорт-завтрака " + WeightAll + " гр!");
        System.out.println("Вес спорт-завтрака " + kg + " кг!");
    }
    public static void task4(){
        int weightBoxer = 7;
        int day250 = weightBoxer * 1000 / 250;
        int day500 = weightBoxer * 1000 / 500;
        int average = (day250 + day500) / 2;
        System.out.println(day250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(day500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("В среднем потребуется " + average + " день, чтобы добиться результата похудения");
    }
    public static void task5(){
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int increaseMasha = Masha + Masha / 10;
        int increaseDenis = Denis + Denis / 10;
        int increaseKristina = Kristina + Kristina / 10;
        int yearMasha = Masha / 10 * 12;
        int yearDenis = Denis / 10 * 12;
        int yearKristina = Kristina / 10 * 12;
        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + yearMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + yearDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseKristina + " рублей. Годовой доход вырос на " + yearKristina + " рублей");
    }
    public static void task6(){
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b+(c-d*e));
        result = result - result * 2;
        System.out.println(result);
    }
    public static void task7(){
        int a2 = 5;
        int b2 = 7;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println("a = " + a2 + "; b = " + b2);
    }
    public static void task8(){
        int a3 = 523;
        int b3 = a3 / 10 % 10;
        System.out.println(b3);
    }
}