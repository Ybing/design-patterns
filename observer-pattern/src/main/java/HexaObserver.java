/**
 * @Description:
 * @Author: 杨亚兵
 * @Date: 2019/10/21 17:01
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hexa Observer : " + Integer.toHexString(subject.getStatu()));
    }
}
