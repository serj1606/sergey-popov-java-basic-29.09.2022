public class CounterStrike {
public static void main(String[] args) {
    String command1 = "Light";
    double adamLight = 10;
    double brianLight = 9;
    double derekLight = 8;
    double ericLight = 7;
    double felixLight = 6;
    double summaLight = adamLight + brianLight + derekLight + ericLight + felixLight;
    double resultLight = summaLight / 5;
    {
        System.out.println("Среднее арифмитическое команды Light " + resultLight);
    }

    String command2 = "Dark";
    double albertDark = 15;
    double billDark = 12;
    double grantDark = 3;
    double jackDark = 7;
    double martinDark = 5;
    double summaDark = albertDark + billDark + grantDark + jackDark + martinDark;
    double resultDark = summaDark / 5;
    {
        System.out.println("Среднее арифмитическое команды Dark " + resultDark);
    }

    if (resultLight > resultDark) {
        System.out.println("Победа команды Light");
    } else if (resultLight < resultDark) {
        System.out.println("Победа команды Dark");
    } else {System.out.println("Ничья между командами Light и Dark");
    }
    System.out.println("Победила команда  " + command2 + "  набравшая   " + resultDark+ "  очков");
}
}
