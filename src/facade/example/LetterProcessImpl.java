package facade.example;

public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("请填写信息的内容..." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("请写收件人地址及姓名..." + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
