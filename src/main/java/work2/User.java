package work2;

public class User {
    private String name;
    private String email;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printInfo(){
        System.out.println("name:"+name + " email:"+email);
    }
}
