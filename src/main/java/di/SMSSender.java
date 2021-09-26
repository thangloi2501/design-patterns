package di;

public class SMSSender implements Sender {

    @Override
    public void send(String msg) {
        System.out.println("SMS send message: " + msg);
    }
}
