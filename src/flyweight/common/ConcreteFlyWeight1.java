package flyweight.common;

public class ConcreteFlyWeight1 extends Flyweight {

    public ConcreteFlyWeight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
