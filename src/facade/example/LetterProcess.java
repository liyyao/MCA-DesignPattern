package facade.example;

/**
 * 投递信件接口
 */
public interface LetterProcess {

    //1.首先要写信的内容
    void writeContext(String context);

    //2.其次写信封
    void fillEnvelope(String address);

    //3.把信装到信封里
    void letterIntoEnvelope();

    //4.邮递
    void sendLetter();
}
