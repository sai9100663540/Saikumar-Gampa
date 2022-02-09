import com.Flyable;

public class Main {
    public static void main(String[] args) {
        Flyable flyable = new Parrot();
        Object o = new Parrot();
        Parrot p = new Parrot();
        p.fly();
        Swimmable penguin = (Swimmable) new Penguin();
        penguin.swim();
        Duck duck = new Duck();
        duck.swim();
        duck.fly();



        }

}
