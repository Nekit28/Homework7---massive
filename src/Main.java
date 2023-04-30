import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] step = new int[3];
        step[0] = 1;
        step[1] = 2;
        step[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(step[i]);
        }
        System.out.println();
        double[] jump = {1.57, 7.654, 9.986};
        jump[0] = 1.57;
        for (int i = 0; i < 3; i++) {
            System.out.println(jump[i]);
        }
        System.out.println();
        int[] tooth = {15, 23, 28, 32};
        tooth[0] = 15;
        for (int i = 0; i < 4; i++) {
            System.out.println(tooth[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] step = new int[3];
        step[0] = 1;
        step[1] = 2;
        step[2] = 3;
        for (int i = 0; i < step.length; i++) {
            System.out.print(step[i]);
            if (i != step.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] jump = {1.57, 7.654, 9.986};
        jump[0] = 1.57;
        for (int i = 0; i < jump.length; i++) {
            System.out.print(jump[i]);
            if (i != jump.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] tooth = {15, 23, 28, 32};
        tooth[0] = 15;
        for (int i = 0; i < tooth.length; i++) {
            System.out.print(tooth[i]);
            if (i != tooth.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] step = new int[3];
        step[0] = 3;
        step[1] = 2;
        step[2] = 1;
        for (int i = 0; i < step.length; i++) {
            System.out.print(step[i] );
            if (i != step.length - 1) {
                System.out.print(", ");
            }
            }
        System.out.println();
        double[] jump = {9.986, 7.654, 1.57};
        jump[0] = 9.986;
        for (int i = 0; i < jump.length; i++) {
            System.out.print(jump[i]);
            if (i != jump.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] tooth = {32, 28, 23, 15};
        tooth[0] = 32;
        for (int i = 0; i < tooth.length; i++) {
            System.out.print(tooth[i]);
            if (i != tooth.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4 (){
        System.out.println("Задача 4");
        int[] hour = {0, 1, 2, 3};
        for (int i = 0; i < hour.length; i++) {
            if (hour[i] % 2 != 0) hour[i] +=1; {
                System.out.print(hour[i]);
                if (i != hour.length -1) {
                    System.out.print(", ");
                }
            }
        }

    }
}
