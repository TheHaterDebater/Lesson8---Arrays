package SamplePrograms;

public class Array2DEx1 {

    public static void main(String[] args) {
        int x[][] = new int[4][5];
        //2D array of 4 rows and columns

        //x[3][2] = 50;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format("%5d |", x[row][col]);
            }
            System.out.println(""); //New line at end of row
        }
        //Make and initialize a 2D array
        System.out.println("\n---------------------\n");
        int marks[][] = {
            {67, 78, 76, 55, 76, 82, 91},
            {88, 65, 77, 99, 55},
            {34, 35, 45, 54},
            {88, 66, 44, 55, 67, 86},
        };
        //Print marks
        //marks.length = number of rows (lenth going down)
        //marks[row].length = number of columns (across) for each row
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format("%5d |", marks[row][col]);
            }
            System.out.println(""); //New line at end of row
        }

    }
}
