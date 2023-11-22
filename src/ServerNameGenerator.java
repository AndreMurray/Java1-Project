public class ServerNameGenerator {
    private static  final String[]  adjective = {"Ashamed","Adorable","Attractive","Beautiful", "Awful", "Aggressive","Cruel","Clever","Tasty","Jealous"};
    private static  final String[] noun = {"John", "house", "affinity", "river","Mary", "room", "apple", "Dog","computer","Thailand"};

    public static String randomThings(String[] adj) {
        int a = (int) Math.floor(Math.random() * adj.length);


        return adj[a];
    }

    // Method to return a random element from an array of strings
//    private static String getRandomElement(String[] array) {
//        Random random = new Random();
//        int randomIndex = random.nextInt(array.length);
//        return array[randomIndex];
//    }

    public static void main(String[] args) {
        String randomAd = randomThings(adjective);
        String randomNo = randomThings(noun);

        String serverName = randomAd + "-" + randomNo;

        System.out.println("Here is your server name:");
        System.out.println(serverName);
    }
}
