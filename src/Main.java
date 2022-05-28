public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Task 1");
        byte itIsByte = 1;
        short itIsShort = -100;
        int itIsInt = 2147483647;
        long itIsLong = 222222222222222L;
        float itIsFloat = -2.5f;
        double IsDouble = 1.999;
        char itIsChar = 'a';
        boolean itIsBool = true;

        // Задача 2
        System.out.println("\nTask 2");
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        System.out.println ("Sum = " + (firstBoxer+secondBoxer));
        System.out.println ("Diff = " + (secondBoxer-firstBoxer));

        // Задача 3
        System.out.println("\nTask 3");
        int babanasAmount = 5;
        int bananaWeight = 80;
        int milkAmount = 2;
        int milkWeight = 105;
        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int eggsAmount = 4;
        int eggWeight = 70;
        int totalWeight = babanasAmount*bananaWeight+milkAmount*milkWeight+iceCreamAmount*iceCreamWeight+eggsAmount*eggWeight;
        System.out.println("Total weight = " + totalWeight + " gramms");
        System.out.println("Total weight = " + (float)totalWeight / 1000 + " kilogramms");

        // Задача 4
        System.out.println("\nTask 4");
        float needToLoose = 7.0f;
        float daysToLoose250 = needToLoose/0.25f;
        float daysToLoose500 = needToLoose/0.5f;
        System.out.println("Days to loose without 250 g = " + daysToLoose250+ " days");
        System.out.println("Days to loose without 500 g = " + daysToLoose500+ " days");

        // Задача 5
        System.out.println("\nTask 5");
        int startSalaryMasha = 67760;
        int startSalaryDenis = 83690;
        int startSalaryKristina = 76230;
        float endSalaryMasha = startSalaryMasha + startSalaryMasha * 0.1f;
        float endSalaryDenis = startSalaryDenis + startSalaryDenis * 0.1f;
        float endSalaryKristina = startSalaryKristina + startSalaryKristina * 0.1f;
        System.out.println("Masha's salary now = " + endSalaryMasha + " Salary increased on " +
                (endSalaryMasha - startSalaryMasha));
        System.out.println("Denis salary now = " + endSalaryDenis + " Salary increased on " +
                (endSalaryDenis - startSalaryDenis));
        System.out.println("Kristina's salary now = " + endSalaryKristina + " Salary increased on " +
                (endSalaryKristina - startSalaryKristina));
    }
}