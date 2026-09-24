public class FavoriteThingsArray {
    public static void main(String[] args) {
        String[] favoriteThings = {
            "C++ Programming",
            "Reading Martial Arts Comics",
            "Running 5km",
            "Photoshop Designing",
            "Playing Minecraft"
        };

        System.out.println("=== MY FAVORITE THINGS ===");

        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        System.out.println("\nTotal number of items in array: " + favoriteThings.length);
    }
}
