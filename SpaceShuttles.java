public class SpaceShuttles {
    public static void main(String[] args) {
        int[] shuttles = new int[100];

        int indexNumberForShuttle = 0;
        int numberForShuttle = 1;

        for (int i = 0; indexNumberForShuttle < shuttles.length; i++) {
            if (isCurrentNumber(numberForShuttle)) {
                shuttles[indexNumberForShuttle] = numberForShuttle;
                indexNumberForShuttle++;
            }
            numberForShuttle++;
        }

        int count = 1;
        for (int shuttle : shuttles) {
            System.out.println("number for " + count + " shuttle: " + shuttle);
            count++;
        }

    }

   private static boolean isCurrentNumber(int number) {
        int a = 10;
        for (int i = 0; i < length(number); i++) {
            int result = getNumber(number, a);
            if (result == 9 || result == 4) {
                return false;
            }
            a *= 10;
        }
        return true;
    }

    private static int getNumber(int k, int a) {
        while (k >= a) k /= 10;
        return k % 10;
    }

    private static int length(int number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }
}