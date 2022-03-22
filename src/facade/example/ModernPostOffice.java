package facade.example;

/**
 * 负责对一个比较复杂的信件处理过程的封装，然后高层模式只要和它有交互就成了
 * 这就是门面模式
 * 这种方式不仅简单，而且扩展性还非常好
 */
public class ModernPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    //后期添加信件检查功能
    private Police letterPolice = new Police();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        //只需要在这里添加代码，高层调用不需要做任何修改
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
