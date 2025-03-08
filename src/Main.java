import java.util.*;

public class Main {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner in = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i + 1));
            name = in.nextLine();
            System.out.println("Введите возраст пользователя " + (i +1));
            age = in.nextInt();
            in.nextLine();

            User temp = new User(name, age);
            users.add(temp);
        }
        System.out.println("");

        Comparator<User> com = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

        Collections.sort(users, com);

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
    }
}
