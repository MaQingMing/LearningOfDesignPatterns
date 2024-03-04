package 单一职责原则;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/3/4 20:57
 */
public class SingleResponsilibity2 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("汽车");
        vehicle1.runAir("飞机");
        vehicle1.runWater("鸭子");
    }
}

//方式二，每个方法之间互不影响，各司其职
class Vehicle1{
    public void run (String args){
        System.out.println(args+"在公路上跑");
    }
    public void runAir (String args){
        System.out.println(args+"在天上飞");
    }
    public void runWater (String args){
        System.out.println(args+"在水里游");
    }
}