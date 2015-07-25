package lecture2;

public class Lecture2 {

    User user;

    public static void main(String[] args) {

      //type link   object
//        User user = new User();
//
//        User user2 = user;

        User user = new User();
        user.printOne();


    }

    public User createUser(User tempUser) {
        User user = new User();
        int a = user.age;
        int b = user.age();
        return user;
    }

    // private > default > protected > public

}
