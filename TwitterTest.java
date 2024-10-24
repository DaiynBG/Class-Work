import java.util.Random;

public class TwitterTest {
        public static void main(String[] args) {
            Person user1 = new Person("Lucas", "@lucas", 200);
            Person user2 = new Person("Austin", "@austin", 300);
            Person user3 = new Person("Ally", "@ally", 400);

            Person[] initialUsers = {user1, user2, user3};
            Twitter twitter = new Twitter(initialUsers);

            twitter.printAllUsers();
            System.out.println("Total Followers: " + twitter.calculateTotalFollowers());

            String[] randomNames = {"Brian", "Macy", "Paul", "Chad", "Veronica", "Jill", "Chris"};

            Person[] persons = new Person[20];
            Random random = new Random();

            System.arraycopy(initialUsers, 0, persons, 0, initialUsers.length);

            for (int i = 3; i < 20; i++) {
                String name = randomNames[random.nextInt(randomNames.length)];
                String username = "@" + name.toLowerCase();
                int numFollowers = random.nextInt(100) + 1;
                persons[i] = new Person(name, username, numFollowers);
            }
            Twitter randomTwitter = new Twitter(persons);

            randomTwitter.printAllUsers();
            System.out.println("Total Followers: " + randomTwitter.calculateTotalFollowers());
        }


}
