/**
 * @Description:
 * @Author: 杨亚兵
 * @Date: 2019/10/21 16:59
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal Observer :" + Integer.toOctalString(subject.getStatu()));
    }
}
