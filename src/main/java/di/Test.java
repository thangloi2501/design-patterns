package di;

public class Test {

    public static void main(String[] args) {
        Sender emailSender = new EmailSender();
        Sender smsSender = new SMSSender();

        Operator operator = new InformationOperator(emailSender);
        operator.broadcast("hehe");

        operator.setSender(smsSender);
        operator.broadcast("haha");
    }
}
