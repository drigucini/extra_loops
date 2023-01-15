public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int start = 1000;
        int x = 0;
        int divideBy = 4;
        while (x < 4) {
            if (start%divideBy == 0) {
                System.out.print(start + " ");
                x++;
            }
            start++;
        }
    }

    public static void task2 () {
        System.out.println("\n\nTask 2");
        int x = 1;
        for (int i = 0; i < 10; i += 1) {
            System.out.print(x + " ");
            x += 2;
        }

    }
    public static void task3 () {
        System.out.println("\n\nTask 3");
        int x = 90;
        while (x >= 0) {
            System.out.print(x + " ");
            x -= 5;
        }
    }

    public static void task4 () {
        System.out.println("\n\nTask 4");
        int x = 2;
        for (int i = 0; i < 10; i += 1) {
            System.out.print(x + " ");
            x = 2 * x;
        }
    }

    public static void task5 () {
        System.out.println("\n\nTask 5");
        int sat = 1;
        int daysPerWeek = 7;
        int lengthOfMonth = 31;
        System.out.println("Weekend of this month are:");
        while (sat < lengthOfMonth) {
            int sun = sat + 1;
            System.out.println (sat + " " + sun);
            sat += daysPerWeek;
        }
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        int overallTickets = 0;
        int first = 1;
        int last = 999_999;
        for (int current = first; current <= last; current++) {
            int first3 = current / 1000;
            int last3 = current % 1000;
            int firstSum = calculateSumOfDigits(first3);
            int lastSum = calculateSumOfDigits(last3);
            if (first3 == 0 || last3 == 0) {
                continue;
            }
            if (firstSum == lastSum) {
                overallTickets++;
            }
        }
        System.out.println("Amount of happy tickets: " + overallTickets);
    }
    public static int calculateSumOfDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }
}