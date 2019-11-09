
import org.junit.Test;

/**
 * @Description: TODO
 * @Author: 杨亚兵
 * @Date: 2019/10/21 16:54
 */
public class ObserverPatternDemoTest {
    @Test
    public void test(){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("Subject set status : 2");
        subject.setStatu(2);

        System.out.println("Subject set status : 15");
        subject.setStatu(15);
    }
}
