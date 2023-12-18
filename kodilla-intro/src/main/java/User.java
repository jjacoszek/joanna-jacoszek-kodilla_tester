public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class App2 {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Katarzyna Nowak", 30);
        users[1] = new User("Jan Kowalski", 24);
        users[2] = new User("Franciszek Sobota", 28);
        users[3] = new User("Maria Strzelecka", 32);
        users[4] = new User("Monika Lubomirska", 41);

        double sum = 0;
        for (int n = 0; n < users.length; n++) {
            sum += users[n].getAge();
        }
        double avg = sum / users.length;
        for (int n = 0; n < users.length; n++) {
            if(users[n].getAge()>avg){
                System.out.println(users[n]);
            }

        }
    }


}


