/**
 * 简单来说：就是一个对象对应着不同类型。
 * 多态在代码中的体现：
 *     父类或接口的引用指向其子类的对象。
 * 多态的好处：
 *   提高了代码的扩展性，前期定义的代码可以使用后期的类容。
 *
 * 多态的弊端：
 *     前期定义的类容不能使用（调用）后期子类的特于类容。
 *
 * 多态的前提：
 *     1，必须要有关系，继承，实现。
 *     2，要有覆盖。
 * */


abstract class Animal
{
    abstract void eat();
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("骨头");
    }
    void lookHome()
    {
        System.out.println("看家");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("鱼");
    }
    void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}
class Pig extends Animal
{
    void eat()
    {
        System.out.println("饲料");
    }
    void gongDi()
    {
        System.out.println("拱地");
    }
}

public class DuoTaiDemo
{
    public static void main(String[] args)
    {
        Animal a = new Cat();  //自动类型提升，猫对象提升了动物类型。但是特有功能无法访问。
                               //作用是限制对特有功能的访问
                               //专业讲：向上转型
        a.eat();
        //如果还想用动物猫的特有功能。可以将该对象进行向下转型。
        Cat c = (Cat)a;   //向下转型的目的是为了使用子类中的特有方法。
                          //注意，对于转型，自始至终都是子类对象在做着类型的变化。
        c.catchMouse();
        method(new Cat());
        method(new Pig());
    }
    public static void method(Animal a)
    {
        a.eat();
        if(a instanceof Cat)  //instanceof:用于判断对象的具体类型。只能用于引用数据类型判断
                              //通常在向下转型前用于健壮性的判断。
        {
            Cat c = (Cat)a;
            c.catchMouse();
        }
        else if(a instanceof Dog)
        {
            Dog d = (Dog)a;
            d.lookHome();
        }
    }
}
