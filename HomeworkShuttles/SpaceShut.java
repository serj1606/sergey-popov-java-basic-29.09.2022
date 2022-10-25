package HomeworkShuttles;

public class SpaceShuttle {
    public static void main(String[] args) {
        int j;
        for (j = 1; j <= 155; j++) {
            if ((j / 10 != 4) && (j % 10 != 4) && (j / 10 != 9) && (j % 10 != 9) && (j / 10 != 14))
                System.out.println("number shuttle " + j); // получается ровно 100 шатлов
        }

    }
}


