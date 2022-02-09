import com.Flyable;

public class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
}
