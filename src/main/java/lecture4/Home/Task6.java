package lecture4.Home;

public class Task6 {
    public static void main (String args[]) {
        User userA = new User("Tom", "tompass", "tom@mail.com");
        User userB = new User("Ben", "benpass", "ben@mail.com");
        User userC = new User("John", "johnpass", "john@pass.com");

        if (userA.equals(userB) || userB.equals(userC) || userC.equals(userA)) {
            System.out.println("Matching!");
        } else {
            System.out.println("Not Matching!");
        }
        if (userA.email.matches("\\w+@\\w+\\.com")){
            System.out.println("Valid");
        }
        if (userB.email.matches("\\w+@\\w+\\.com")){
            System.out.println("Valid");
        }
        if (userC.email.matches("\\w+@\\w+\\.com")){
            System.out.println("Valid");
        }

    }
}

