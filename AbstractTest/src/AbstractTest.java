/**
 * 雇佣示例：
 * 需求：公司中程序员有姓名，工号，薪水，工作类容。
 * 项目经理除了有姓名，工号，薪水，还有奖金，工作类容。
 *对给出需求进行数据建模。
 *
 * 分析：
 * 在这个问题领域中，先找出涉及的对象。
 *
 * */

abstract class Employee
{
    private String name;
    private String id;
    private double pay;
    Employee(String name,String id,double pay)
    {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }
    public abstract void work();
}
//描述程序员
class Programmer extends Employee
{
    Programmer(String name,String id,double pay)
    {
        super(name,id,pay);
    }
    public void work()
    {
        System.out.println("code...");
    }
}
//描述经理
class Manager extends Employee
{
    private int bonus;
    Manager(String name,String id,double pay,int bonus)
    {
        super(name,id,pay);
        this.bonus = bonus;
    }
    public void work()
    {
        System.out.println("manage");
    }
}


public class AbstractTest
{
    public static void main(String[] args)
    {
        Programmer p = new Programmer("chen","122",1.24);
        Manager m = new Manager("fang","324",123.4,24);
        p.work();
        m.work();


    }
}
