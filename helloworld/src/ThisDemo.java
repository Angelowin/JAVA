class Person
{
    private String name;
    private int age;
    Person()
    {
        name = "baby";
        age = 1;
        System.out.println("person run");
    }
    Person(String name)
    {
        this();
        this.name = name;
    }
    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void speak()
    {
        System.out.println(this.name+":"+this.age);
    }
    public boolean compare(Person p)
    {
        return this.age==p.age;
    }
}

public class ThisDemo
{
    public static void main(String[] args)
    {
        new Person();
        Person p = new Person("旺财",30);
        p.speak();
        Person p1 = new Person("小强");
        p1.speak();
        p.compare(p1);
    }
}
