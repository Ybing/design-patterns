/**
 * @Description: TODO
 * @Author: 杨亚兵
 * @Date: 2019/10/21 16:49
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary Observer : "+ Integer.toBinaryString(subject.getStatu()));
    }
}
