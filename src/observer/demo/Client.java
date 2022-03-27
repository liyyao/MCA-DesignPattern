package observer.demo;

public class Client {

    public static void main(String[] args) {
        HanFeZi h = new HanFeZi();
        Lisi l = new Lisi();
        h.addObserver(l);
        h.haveBreakfast();
    }
}
