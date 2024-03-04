package 单一职责原则;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/3/4 21:00
 */
public class SingleResponsilibity3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle2.run("汽车");
        vehicle3.run("摩托车");
    }
}

//符合单一职责原则，类与类之间互不影响
class Vehicle2{
    public void run (String args){
        System.out.println(args+"在公路上跑");
    }
}

class Vehicle3{
    public void run (String args){
        System.out.println(args+"在公路上跑");
    }
}

