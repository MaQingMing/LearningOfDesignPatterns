package 单一职责原则;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/3/4 20:29
 */
public class SingleResponsilibity1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}


//交通工具类
//方式一
class Vehicle{
    public void run (String args){
        System.out.println(args+"在公路上跑");
    }
}
