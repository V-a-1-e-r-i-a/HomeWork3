public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int a = 1000000;
        System.out.printf("Значение переменной a с типом int равно " + a);
        byte b = 100;
        System.out.printf("Значение переменной b с типом byte равно " + b);
        long c = 120000000;
        System.out.printf("Значение переменной c с типом long равно " + c);
        float d = 30;
        System.out.printf("Значение переменной d с типом float равно " + d);
        double e = 20.8;
        System.out.printf("Значение переменной e с типом double равно " + e);

        //Задание 2
        System.out.println("Задание 2");
        float a1 = 27.12F;
        long b1 = 987678965549L;
        double c1 =2.786;
        boolean d1 = false;
        char e1 = 596;
        short f1 = -159;
        int g1 = 27897;
        byte h1 = 67;

        //Задание 3
        System.out.println("Задание 3");
        byte lyudmilaPavlovnaStydents = 23;
        byte annaSergeevnaStydents = 27;
        byte ekaterinaAndreevnaStydents = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " +paper / (lyudmilaPavlovnaStydents+annaSergeevnaStydents+ekaterinaAndreevnaStydents) + " листов бумаги.");

        //Задание 4
        System.out.println("Задание 4");
        byte bottles2Minutes = 16;
        int bottles20Minutes = bottles2Minutes / 2 * 20;
        System.out.printf("За 20 минут машина производит " + bottles20Minutes + " бутылок.");
        int bottles1Day = bottles20Minutes * 3 * 24;
        System.out.printf("За 1 день машина производит " + bottles1Day + " бутылок.");
        int bottles3Day = bottles1Day * 3;
        System.out.printf("За 3 дня машина производит " + bottles3Day + " бутылок.");
        int bottles1Month = bottles3Day * 10;
        System.out.printf("За 1 месяц машина производит " + bottles1Month + " бутылок.");

        //Задание 5
        System.out.println("Задание 5");
        int banksForAllClasses = 120;
        int whiteCansFor1Class = 2;
        int brownCansFor1Class = 4;
        int allClasses = banksForAllClasses / (brownCansFor1Class + whiteCansFor1Class);
        int whiteCansForAllClasses = allClasses * whiteCansFor1Class;
        int brownCansForAllClasses = allClasses * brownCansFor1Class;
        System.out.println("В школе где " + allClasses + " классов, нужно " + whiteCansForAllClasses + " белой краски и " + brownCansForAllClasses + " банок коричневой класски.");

        //Задание 6
        System.out.println("Задание 6");
        int bananas = 5;
        int gramOfBananas = bananas * 70;
        int milk = 200;
        int gramOfMilk = (milk / 100) * 105;
        int iceCream = 2;
        int gramOfIceCream = iceCream * 100;
        int eggs = 4;
        int gramOfEggs = eggs * 70;
        int gramOfBreakfast = gramOfBananas + gramOfMilk + gramOfIceCream + gramOfEggs;
        System.out.println("Грамм еды " + gramOfBreakfast);
        float kilogramOfBreakfast = gramOfBreakfast / 1000;
        System.out.println("Киллограм еды " + kilogramOfBreakfast);

        //Задание 7
        System.out.println("Задание 7");
        int needToLoseKilo = 7;
        int needToLoseGram = needToLoseKilo * 1000;
        int slowWay1Day = 250;
        int slowWay = needToLoseGram / slowWay1Day;
        System.out.println("Потребуется " + slowWay + " дней, чтобы сбросить 7 килограмм, если в день терять 250 грамм.");
        int quickWay1Day = 500;
        int quickWay = needToLoseGram / quickWay1Day;
        System.out.println("Потребуется " + quickWay + " дней, чтобы сбросить 7 килограмм, если в день терять 500 грамм.");
        int middleWay = (quickWay + slowWay) / 2;
        System.out.println("В среднем может потребоваться " + middleWay + " день, чтобы сбросить 7 килограмм.");

        //Задание 8
        System.out.println("Задание 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int newMashaSalary = mashaSalary / 100 * 110;
        System.out.println("Зарплаты Маши, после повышения на 10% составляет " + newMashaSalary + " рублей в месяц.");
        System.out.println("Разница годового дохода Маши, после повышения зарплаты состовляет " + (newMashaSalary - mashaSalary) * 12 + " рублей.");
        int newDenisSalary = denisSalary / 100 * 110;
        System.out.println("Зарплаты Дениса, после повышения на 10% составляет " + newDenisSalary + " рублей в месяц.");
        System.out.println("Разница годового дохода Дениса, после повышения зарплаты состовляет " + (newDenisSalary - denisSalary) * 12 + " рублей.");
        int newKristinaSalary = kristinaSalary / 100 * 110;
        System.out.println("Зарплаты Кристины, после повышения на 10% составляет " + newKristinaSalary + " рублей в месяц.");
        System.out.println("Разница годового дохода Кристины, после повышения зарплаты состовляет " + (newKristinaSalary - kristinaSalary) * 12 + " рублей.");

    }
}