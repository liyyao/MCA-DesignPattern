package facade.example;

public class Client02 {

    public static void main(String[] args) {
        ModernPostOffice modernPostOffice = new ModernPostOffice();
        String context = "Hello, It's me, do you know who I am?";
        String address = "Happy Road No.666, God Province, Heaven";
        modernPostOffice.sendLetter(context, address);
    }
}
