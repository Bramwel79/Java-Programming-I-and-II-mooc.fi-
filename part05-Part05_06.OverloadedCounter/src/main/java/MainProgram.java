
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        counter.increase();
        counter.decrease();
        counter.increase(10);
        counter.decrease(-10);
        System.out.println(counter);
    }
}
