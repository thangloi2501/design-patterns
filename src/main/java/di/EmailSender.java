package di;

public class EmailSender implements Sender {

    @Override
    public void send(String msg) {
        System.out.println("Email send message: " + msg);
    }
}
