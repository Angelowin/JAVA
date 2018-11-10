

/**
 在子父类中，成员的特点体现。
 1，成员变量。
 2，成员函数。
 3，构造函数。

 */

//1,成员变量。
 /**
  *当本类的成员和局部变量同名用this区分
  * 当子父类中的成员变量同名时用super区分父类。
  *
  * this和super的用法很相似。
  *
  * this：代表一个体系对象的引用。
  * super：代表一个父类空间。
  * */

class Fu
{
    private int num1 = 4;
    public int getNum()
    {
        return num1;
    }
}
class Zi extends Fu
{
    private int num = 5;
    void show()
    {
        System.out.println(super.getNum()+"..."+num);
    }
}
public class ExtendsDemo2
{
    public static void main(String[] args)
    {
        Zi z = new Zi();
        z.show();
    }
}
