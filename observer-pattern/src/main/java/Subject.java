import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: 杨亚兵
 * @Date: 2019/10/21 16:41
 */
public class Subject {
    private List<Observer> observerList = new LinkedList<>();
    private Integer statu;

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        this.observerList.add(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer : observerList){
            observer.update();
        }
    }
}
