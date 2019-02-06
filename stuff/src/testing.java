public class testing {
    public static void main(String []args) {

        person kyle = new person();
        kyle.setAge(20);
        kyle.setName("Kyle");
        kyle.setHeight(6.1);

        person nick = new person("Nick", 23, 6.0);

        System.out.println(nick.getName() + "'s age is " + nick.getAge());

        System.out.println(kyle.getName() + "'s age is " + kyle.getAge());
    }
}
