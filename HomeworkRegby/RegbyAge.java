package HomeworkRegby;

public class RegbyAge {
    public static void main(String[] args) {
        int[] lions = {18, 20, 23, 24, 36, 19, 25, 22, 39, 38, 37, 26, 26, 28, 29, 30, 31, 32, 33, 34, 35, 36, 39, 39, 40};
        System.out.print(" возраст игроков команды Львы: ");

        for (int i = 0; i < lions.length; i++) {
            System.out.print(lions[i] + ",");
        }
        int[] panthers = {19, 24, 36, 24, 36, 19, 25, 22, 39, 38, 37, 26, 26, 28, 29, 30, 31, 32, 25, 31, 28, 39, 22, 36, 35};

        System.out.print('\n' + " возраст игроков команды Пантеры: ");

        for (int j = 0; j < panthers.length; j++) {
            System.out.print(panthers[j] + ",");
        }

        double sum1 = 0;
        double sum2 = 0;

        for (double x : lions)
            sum1 = sum1 + x;

        System.out.println('\n' + "Среднее арифмитическое возраста игроков команды Львы = " + sum1 / lions.length);

        for (double y : panthers)
            sum2 = sum2 + y;

        System.out.println("Среднее арифмитическое возраста игроков команды Пантеры = " + sum2 / panthers.length);
    }
}

