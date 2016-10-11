package looppractice;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of x is " + i);
            if (i == 7) {
                break;
            }
        }
        System.out.println("The End");
    }

    public static void practiceForLoop2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }
    }

    public static void main(String[] args) {

        //practiceWhileLoop();
        //practiceDoWhileLoop();
        //practiceForLoop();
        practiceForLoop2();

    }

}
