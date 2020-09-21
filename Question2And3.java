import javax.swing.JOptionPane;

public class Question2And3 {
    public static void main(String[] args) {
        String inputMark;
        String passResults;
        String errorMessage;
        int mark;
        int studentsPassed = 0;
        int studentsFailed = 0;
        int i = 0;

        // Set up a while loop for ten loops to ask the user for their input mark
        // Convert user input to an integer
        // If the mark is above 50, then add 1 to the counter of passed students
        // If below 50, add 1 to the counter of failed students
        // Add 1 to the loop
        while (i < 10) {
            inputMark = JOptionPane.showInputDialog("Please enter your percentage mark: ");
            mark = Integer.parseInt(inputMark);
            // Validate mark is between acceptable range
            if (mark >= 0 && mark <= 100) {

                if (mark >= 50) {
                    studentsPassed++;
                } else {
                    studentsFailed++;
                }
                i++;
            // If input mark is not in valid input range
            } else {
                errorMessage = "Please enter a valid mark between 0 and 100.";
                JOptionPane.showMessageDialog(null, errorMessage, "Invalid Input",JOptionPane.PLAIN_MESSAGE);
            }
        }

        passResults = "The number of students who passed is " + studentsPassed + ". The number of students who failed is " + studentsFailed + ".";
        JOptionPane.showMessageDialog(null, passResults);
    }
}
