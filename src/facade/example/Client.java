package facade.example;

/**
 * 整个寄信的过程需要客户亲力亲为，而且中间的顺序还不能乱，没有完成一个类所具有的单一职责
 */
public class Client {

    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hello, It's me, do you know who I am?");
        letterProcess.fillEnvelope("Happy Road No.666, God Province, Heaven");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
