package flyweight.common;

public class ConcreteFlyWeight2 extends Flyweight {

    public ConcreteFlyWeight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
