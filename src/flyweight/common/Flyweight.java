package flyweight.common;

/**
 * 抽象享元角色
 */
public abstract class Flyweight {

    //内部状态
    private String intrinsic;
    //外部状态
    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "intrinsic='" + intrinsic + '\'' +
                ", extrinsic='" + extrinsic + '\'' +
                '}';
    }
}
