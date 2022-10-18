package chineseDynasties;

public class ChineseDynasties {
    public static void main(String[] args) {
        double warriorLee = 13 * 860;// сумма атаки воинов династии Ли
        double archerLee = 24 * 860;// сумма атаки лучников династии Ли
        double horsemanLee = 46 * 860;// сумма атаки всадников династии Ли
        double summaryattackLee = (warriorLee) + (archerLee) + (horsemanLee);
        System.out.println("общий показатель атаки династии Ли " + summaryattackLee);

        double warriorMi = 9 * 860 * 1.5;// сумма атаки воинов династии Минь
        double archerMi = 35 * 860 * 1.5;// сумма атаки лучников династии Минь
        double horsemanMi = 12 * 860 * 1.5;// сумма атаки всадников династии Минь
        double summaryattackMi = (warriorMi) + (archerMi) + (horsemanMi);
        System.out.println("общий показатель атаки династии Минь " + summaryattackMi);

    }
}
