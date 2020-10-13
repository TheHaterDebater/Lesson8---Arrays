package SamplePrograms.ArrayMethods;

import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        String attendance[][] = {
            {"Joe", "S09", "S12", "O14"},
            {"Bob", "O13"},
            {"Sue", "S24", "O12"},
            {"Amy", "S05", "S23", "O11", "O23", "N12", "N23"}
        };
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(j == 0 ? attendance[i][j] + " ABSENT DAYS: "
                        : attendance[i][j] + " | ");
            }
            System.out.println("\n------------------------");
        }
        Scanner s = new Scanner(System.in);
        String nm = s.next();
        String results[] = getDates(nm, attendance);
        if (results.length == 0) {
            System.out.println("Student not found");
        } else {
            System.out.println(nm + " has had " + results.length + " absences");
            for (int i = 0; i < results.length; i++) {
                System.out.print(results[i] + ", ");
            }
        }
    }

    public static String[] getDates(String nm, String att[][]) {
        String dates = ""; //Split this into an array
        for (int i = 0; i < 10; i++) {
            if (nm.equals(att[i][0]));
            for (int j = 0; j < att[i].length; j++) {
                dates += att[i][j] + ", ";
            }
        }
        if (dates.length() == 0) {
            return new String[0];
        } else {
            return dates.split(", ");
        }
    }
}
