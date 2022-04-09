package state.v3;

/**
 * 电梯实现类比较长
 * 扩展性非常差
 * 非常规状态无法实现
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                //do nothing
                break;
            case CLOSING_STATE:
                this.openWithoutLogin();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                this.openWithoutLogin();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:     //可以关门，同时修改电梯状态
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //do nothing
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:     //可以关门，同时修改电梯状态
                //do nothing
                break;
            case CLOSING_STATE:
                this.runWithoutLogin();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                this.runWithoutLogin();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:     //可以关门，同时修改电梯状态
                //do nothing
                break;
            case CLOSING_STATE:
                this.stopWithoutLogin();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogin();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }

    /**
     * 纯粹的电梯关门，不考虑实际的逻辑
     */
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    /**
     * 纯粹的电梯开门，不考虑任何条件
     */
    private void openWithoutLogin() {
        System.out.println("电梯门开启...");
    }

    /**
     * 纯粹的电梯运行，不考虑其他条件
     */
    private void runWithoutLogin() {
        System.out.println("电梯上下运行起来...");
    }

    /**
     * 纯粹的电梯停止，不考虑其他条件
     */
    private void stopWithoutLogin() {
        System.out.println("电梯停止了...");
    }

}
