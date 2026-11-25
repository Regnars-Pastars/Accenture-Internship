public class main {
    // I used static method to help me calculate the average and to make the code more readable
    static int averageMark(int a[][], int i, int j, int length) {
        if (j == length - 1)
            return a[i][j];
        return a[i][j] + averageMark(a, i, j + 1, length);
    }

    public static void main(String[] args) {
        int count = 0;
        int [][] marks = { {10, 8, 9, 3}, {1, 4, 2, 5}, {10, 10, 10, 9}, {1, 1, 1, 2}, {3, 7, 9, 5} };
        for (int i = 0; i < marks.length; ++i){
            System.out.print("Student " + ++count + " marks: ");

            for (int j  = 0; j < marks[i].length; ++j){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("");

            int average = averageMark(marks, i, 0, marks[i].length) / marks[i].length;

            System.out.println("Average: " + average);
            if (average >=5){
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}

