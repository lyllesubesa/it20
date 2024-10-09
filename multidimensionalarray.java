package Multidimensional_Array;

public class multidimensionalarray {
    public static void main(String[] args) {
        // Inputs for the array (Simple Character)
        String[][] artArray = {
            {".", "-", "-", "-", "."},
            {"|", "0", ",", "0", "|"},
            {"[", " ", "-", " ", "]"},
            {"|", "_", "|", "_", "|"}
        };

        // Nested for loop to print the multidimensional array
        for (int row = 0; row < artArray.length; row++) {
            for (int column = 0; column < artArray[row].length; column++) {
                System.out.print(artArray[row][column]);
            }
            // Added println for a new line after each row
            System.out.println();
        }
    }
}
