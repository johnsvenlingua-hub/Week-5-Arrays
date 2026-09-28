public class Student {
    String name;
    double[] quizzes;

    public Student(String name, double[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    public double getAverage() {
        double sum = 0;
        for (double quiz : quizzes) {
            sum += quiz;
        }
        return sum / quizzes.length;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        double[][] rawQuizData = {
            {85.0, 90.0, 88.0, 92.0},
            {95.0, 92.0, 88.0, 91.0},
            {85.0, 90.0, 88.0, 92.0},
            {70.0, 75.0, 80.0, 78.0},
            {95.0, 98.0, 92.0, 96.0}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        sortStudentsByAverage(students);
        printLeaderboard(students);

        String searchName = "Alice";
        int rank = linearSearchRank(students, searchName);
        if (rank != -1) {
            System.out.println("\n" + searchName + " is ranked #" + rank);
        } else {
            System.out.println("\n" + searchName + " was not found.");
        }
    }

    public static void sortStudentsByAverage(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static int getDisplayRank(Student[] students, int index) {
        int rank = 1;
        for (int i = 0; i < index; i++) {
            if (students[i].getAverage() > students[index].getAverage()) {
                rank = i + 1;
            }
        }
        return rank;
    }

    public static int linearSearchRank(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                return getDisplayRank(students, i);
            }
        }
        return -1;
    }

    public static void printLeaderboard(Student[] students) {
        System.out.println("----------------------------------------");
        System.out.printf("%-6s %-12s %-10s\n", "Rank", "Name", "Average");
        System.out.println("----------------------------------------");
        for (int i = 0; i < students.length; i++) {
            int displayRank = getDisplayRank(students, i);
            System.out.printf("%-6d %-12s %-10.2f\n", displayRank, students[i].name, students[i].getAverage());
        }
        System.out.println("----------------------------------------");
    }
}
