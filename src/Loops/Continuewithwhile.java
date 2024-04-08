package Loops;

public class Continuewithwhile {
    public static void main(String[] args) {
        int count = 20;
        while (count >= 0) {
            if (count == 7 || count == 15) {
                count--;
                continue;
            }

            System.out.println(count);

        }
    }
}
