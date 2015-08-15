package lecture4.Home;

public class User {

    private String login;
    private String password;
    public String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        if(email.matches("\\w+@\\w+\\.com")){
            System.out.println("email is Valid!");
        }
        else {
            System.out.println("Email is not Valid!");
        }
        this.email = email;
        }

    public boolean equals (Object e){
    User userC = (User)e;
    return this.login.equals(userC.login) && this.password.equals(userC) && this.email.equals(userC);
    }
}

