
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());
        Message m = new Message("sender", "message");
        ms.add(m);
       System.out.println(ms.getMessages()); // expected:<1>
    }
}
