package StudentGUI;

public class Student {

    private String name;
    private int[] marks;
    private int mark1, mark2, mark3;

    public Student(String nm, int m[]) {
        name = nm;
        marks = m;
    }

    public Student(Student s) {
        this(s.name, s.marks);
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setMark(int whichmark, int number) {
        marks[number - 1] = whichmark;
    }

    public int getAverage() {
        int average;
        average = (marks[0] + marks[1] + marks[2]) / 3;
        return average;
    }

    public int getMark(int whichmark) {
        return marks[whichmark - 1];
    }

    public int getHighscore() {
        int high = marks[0];
        high = Math.max(high, marks[1]);
        high = Math.max(high, marks[2]);
        return high;
    }

    public String toString() {
        String str;
        str = "Name:\t\t" + name + "\n";
        str += "" + getAverage();
        return str;
    }

    public String getName() {
        return name;
    }

    public String validateData() {
        String errormessage = null;
        if (name.length() < 2) {
            errormessage = "Name is required";
        }
        if (marks[0] < 0 || marks[0] > 100 || marks[1] < 0 || marks[1] > 100 || marks[2] < 0 || marks[2] > 100) {
            errormessage += ("At least one mark is not within acceptable range.");
        }
        if (errormessage == null) {
            errormessage += ("\nPlease re-enter all data");
        }
        return errormessage;

    }
}
