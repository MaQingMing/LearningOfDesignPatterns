package 策略模式;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/3/3 10:27
 */
public class main {

    public static void main(String[] args) {
        content content1;
        content1 = new content(new ConcreteStrategyA());
        content1.contentInterface();

        content1 = new content(new ConcreteStrategyB());
        content1.contentInterface();

        content1 = new content(new ConcreteStrategyC());
        content1.contentInterface();
    }
}
