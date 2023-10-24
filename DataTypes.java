public class DataTypes {
    public static void main(String[] args) {
        final int[] INPUT = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // The final makes this unchangable and the numbers are labeled as INPUT
        int sum = 0;
        String sumString = "0";
        double sumDouble = 0.0;
// these are the different types of sums that are going to appear in the output, I put one for int(single number), for String (Word), and one for Double(decimal)
        for (int num : INPUT) { // This loop goes through the numbers in the INPUT and like assings them to Num
            sum += num; // Adds all the stuff from num to the sum (0)
            sumString = String.valueOf(Integer.parseInt(sumString) + num); // Turns the sumString from a variable to an integer with the Integer/parseInt and then adds the num to it and turns it back into string with the string.valueOf so basically its just making the number a word.
            sumDouble += num; // adds the stuff from num to the sum but this time with a decimal
        }

        System.out.println("Sum as int: " + sum); // Prints the Int sum
        System.out.println("Sum as String: " + sumString); // Prints the String Sum
        System.out.println("Sum as double: " + sumDouble); // Prints the decimal Sum
    }
}
