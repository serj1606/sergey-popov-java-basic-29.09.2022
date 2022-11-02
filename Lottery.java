import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] mas1 = new int[]{23, 35, 14, 25, 84, 55, 79};
        int[] mas2 = new int[]{84, 14, 56, 25, 81, 38, 1};
        Arrays.sort(mas1);
        Arrays.sort(mas2);
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        System.out.println("совпали следующие элементы");
        for (int m1 = 0, m2 = 0; m1 < mas1.length; ) {
            if (mas1[m1] == mas2[m2]) {
                System.out.println(mas1[m1]);

             m1 = Math.min(m1 + 1, mas1.length);
                m2 = Math.min(m2 + 1, mas2.length);
            } else if (mas1[m1] > mas2[m2]) m2 = Math.min(m2 + 1, mas2.length);
            else m1 = Math.min(m1 + 1, mas1.length);
            }
        }
    }




