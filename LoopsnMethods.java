public class LoopsnMethods {

    private static int[] array = new int[] { 
        1, 2, 3, 4, 5
    };
    // This is the array of all the numbers we are gonna be printing using the loops
    public static void printWhile() {
        int i = 0;
        while (i < 5) {
            System.out.println(array[i]);
            i++;
        }
    }
    // From my knowledge, the While loop decrares the integer (i) as 0, then while the i is less than 5, it will print the value and then add one to it each time the loop repeats. It will print the (array{i}) which increases in value each time untill all 5 numbers are printed. This is relevant in most of the other loops.
    public static void printDoWhile() {
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < 5);
    }
    // The DoWhile loop declares the integer (i) as 0 then the do section is running the code in the { } and the while is telling the do to run the code while the interger (i) is less than 5.
    public static void printForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
    // The for loop declares i as 0 then loops the code that prints each array element to the i while i is less than 5 while also adding 1 to the i each time.
    public static void printForEach() {
        for (int element : array) {
            System.out.println(element);
        }
    }
    // The for each loop is the same as the for loop exept this time it takes each element from the array and prints them untill it has gone trhough each and every one.
    public static void printWithCondition(int condition) {
        for (int element : array) {
            if (element == condition) {
                System.out.println(element);
                // The condition wil only print the number of the condition value. It first runs through each element of the array using a for loop then it uses and if loop to check if the condition is equal to an element in the array. If it is then it will print that exact element.
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
        printWithCondition(2);
    }
}
// These final lines of code print a title for each loop and also the array that each loop printed. The print with condition states the condition that is going to be used in the print with condition loop.