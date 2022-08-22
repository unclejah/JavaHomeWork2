public class Main {
    public static void main(String[] args) {
//Exercise 1
        byte by = 100;
        short s = 1234;
        int i = 423423;
        long l = 3423423423L;
        float f = 123.3F;
        double dou= 123.33;
        char ch = 32;
        boolean bo = true;

        //Exercise 2
        float weightB1 = 78.2f;
        float weightB2 = 82.7f;
        float allWeight = weightB1 +weightB2;
        System.out.println("Общий вес = "+ allWeight);
        float difWeight = weightB1 - weightB2;
        System.out.println("Разница в вес 1 = " + difWeight);
        float difWeight2 = weightB2 - weightB1;
        System.out.println("Разница в вес 2 = " + difWeight2);
        float difWeight3 = weightB2 % weightB1;
        System.out.println("Разница в вес 3 = " + difWeight3);

        //Exercise 3
        int banan = 80;
        int milk = 105;
        int plomb = 100;
        int eggs = 70;
        int blender = 5 * banan + 200/100*milk + 2*plomb + 4 *eggs;
        System.out.println("Общий вес = " + blender + " грамм");
        float blenderKg = 0f;
        blenderKg= blender / 1000.0f;
        System.out.println("Общий вес = " + blenderKg + " киллограмм");

        //Exercise 4
        int day250 = 7 * 1000 / 250;
        int day500 = 7 * 1000 / 500;
        System.out.println("по 250 в день = "+ day250);
        System.out.println("по 500 в день = "+ day500);
        int sred = (day500 + day250) / 2;
        System.out.println("среднее количество дней = " + sred);

        //Execersie 5
        int maria = 67760;
        int denis = 838690;
        int kristina = 76230;
        int maria10 = maria + maria / 10;
        int denis10 = denis + denis / 10;
        int kristina10 = kristina + kristina / 10;
        int mariaYear = 12 * maria;
        int denisYear = 12 * denis;
        int kristinaYear = 12 * kristina;
        int mariaYear10 = 12 * maria10;
        int denisYear10 = 12 * denis10;
        int kristinaYear10 = 12 * kristina10;
        int mariaPlus = mariaYear10 - mariaYear;
        int denisPlus = denisYear10 - denisYear;
        int kristinaPlus = kristinaYear10 - kristinaYear;
        System.out.println("Маша теперь получет "+maria10+ " рублей. Годовой доход вырос на " +mariaPlus);
        System.out.println("Денис теперь получет "+denis10+ " рублей. Годовой доход вырос на " +denisPlus);
        System.out.println("Кристина теперь получет "+kristina10+ " рублей. Годовой доход вырос на " +kristinaPlus);
    }
}
