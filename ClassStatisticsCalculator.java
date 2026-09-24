public class ClassStatisticsCalculator {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 64, 95, 88, 72, 90};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("=== CLASS STATISTICS ===");
        System.out.println("Total Sum of Scores: " + sum);
        System.out.println("Average Score:       " + average);
        System.out.println("Highest Score:       " + highest);
        System.out.println("Lowest Score:        " + lowest);
    }
}
