public class LoopsnMethods {

    private static int[] array = new int[] {
        1, 2, 3, 4, 5
    };

    public static void printWhile() {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void printDoWhile() {
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < 5);
    }

    public static void printForLoop() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printForEach() {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void printWithCondition(int condition) {
        for (int element : array) {
            if (element == condition) {
                System.out.println(element);
                // You can use different loop types here as well, e.g., while or for loop.
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---|   While Loop   |---");
        printWhile();
        System.out.println("---| Do While Loop  |---");
        printDoWhile();
        System.out.println("---|    For Loop    |---");
        printForLoop();
        System.out.println("---| For Each Loop  |---");
        printForEach();
        System.out.println("---| With Condition |---");
        // In this case, the example is 3, but the parameter could be any int value.
        printWithCondition(3);
    }
}