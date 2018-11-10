/**
 abstract class AbsDemo
 {
    abstract void show1();
    abstract void show2();
 }

 当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用另一种
 形式定义和表示，就是接口 interface。
 * */
//定义接口使用的关键字不是class，是interface。
/**
 * 对于接口中常见的成员：而且这些成员都有固定的修饰符。
 * 1，全局变量。public static final
 * 2，抽象方法。public abstract
 *
 * 由此可得，接口中的成员都是公共的权限。
 * */

interface Demo
{
    public static final int NUM = 4;
    public abstract void show1();
    public abstract void show2();
}
//类与类之间是继承关系，类与接口之间是实现关系。
/**
 * 接口不可实例化。
 * 只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化。
 * 否则，这个子类就是一个抽象类。
 * */

class DemoImpl implements Demo
{
    public void show1()
    {
        System.out.println("zi1");
    }
    public void show2()
    {
        System.out.println("zi2");
    }
}

/**
 * 在java中不直接支持多继承，因为会出现调用的不确定性。
 * 所以java将多继承机制进行改良，在java中变成了多实现。
 *
 * 一个类可以实现多个接口。
 *
 * */

interface A
{
    public void showA();
}
interface Z
{
    public int showZ(int a, int b);
}
class Test implements A,Z  //多实现
{
    public int showZ(int a,int b)
    {
        return a+b;
    }
    public void showA()
    {
        System.out.println("showa");
    }
}

/**
 * 一个类在继承另一个类的同时，还可以实现多个接口。
 *
 * */
class Q
{
    public void method()
    {
        System.out.println("Q");
    }
}

class Test2 extends Q implements A,Z
{
    public void showA()
    {
        System.out.println("test2_1");
    }
    public int showZ(int a,int b)
    {
        return a+b;
    }
    public void method()
    {
        System.out.println("Q_test2");
    }
}
/**
 * 接口的出现避免了单继承的局限性。
 * */

interface CC
{
    void show();
}
interface MM
{
    void method();
}
interface QQ extends CC,MM//接口和接口之间是继承关系，而且接口可以多继承
{
    void function();
}
class WW implements QQ
{
    public void show()
    {
        System.out.println("CC");
    }
    public void method()
    {
        System.out.println("MM");
    }
    public void function()
    {
        System.out.println("QQ");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        DemoImpl d = new DemoImpl();
        System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM);
        System.out.println("Hello World!");
        Test t = new Test();
        System.out.println(t.showZ(3,5));
        t.showA();
    }
}
