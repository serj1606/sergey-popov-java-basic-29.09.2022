package fitnessTracker;

public class MainFitnessTracker {
    public static void main(String[] args) {

        FitnessTracker client1 = new FitnessTracker("Ted", "Smith@gmail.com", 16, 7, 1985, 80677775522L,
                "Smith", 75, 150, 9000);
        FitnessTracker client2 = new FitnessTracker("John", "Dave@gmail.com", 25, 12, 1990, 80933775522L,
                "Davis", 65, 140, 5000);
        FitnessTracker client3 = new FitnessTracker("Adam", "adm@gmail.com", 30, 11, 1995, 80666775522L,
                "Brown", 90, 155, 6000);

        client1.printAccountInfo(client1.toString());
        client2.printAccountInfo(client2.toString());
        client3.printAccountInfo(client3.toString());

        System.out.println("");
        System.out.println("изменил у двух клиентов несколько параметров и снова распечатал, как в задании");
        System.out.println("");

        client1.setArterialPressure(120);
        client1.setWeight(65);
        client3.setWeight(80);
        client3.setNumberOfStepsDay(7500);
        client1.printAccountInfo(client1.toString());
        client2.printAccountInfo(client2.toString());
        client3.printAccountInfo(client3.toString());

    }
}