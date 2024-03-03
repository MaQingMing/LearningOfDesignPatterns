package 策略模式;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/3/3 10:25
 */

/**
 * 上下文，维护对象的引用
 */
public class content {
    strategy strategy;

    public content(策略模式.strategy strategy) {
        this.strategy = strategy;
    }
    public void  contentInterface(){
        //根据具体的策略对象，调用琦算法的方法
        strategy.algorithmInterface();
    }
}
