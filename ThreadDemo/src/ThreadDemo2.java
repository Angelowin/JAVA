/**
 * 创建线程的第一种方式：继承Thread类。
 * 创建线程的第二种方式：实现Runnable接口。
 * 1，定义类实现Runnable接口。
 * 2，覆盖接口中的run方法，将线程的任务代码封装到run方法。
 * 3，通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递。
 *    为什么？因为线程的任务都封装在Runnable接口子类对象的run方法中。
 * 4，调用线程对象的start方法开启线程。
 *
 * 实现Runnable接口的好处：
 *     1，将线程的任务从线程的子类中分离出来，进行单独封装。
 *        按照面向对象的思想将任务封装成对象。
 *     2，避免了java单继承的局限性。
 *
 *所以创建线程的第二种方式较为常用。
 * */
class Demo2 implements Runnable   //extends Fu //准备扩展Demo类的功能，让其中的类容可以作为线程的任务执行。
                                 //通过接口的形式完成。
{
    public void run()
    {
        show();
    }
    public void show()
    {
        for(int x = 0; x<20; x++)
        {
            System.out.println(Thread.currentThread().getName()+"......"+x);
        }
    }
}

public class ThreadDemo2
{
    public static void main(String[] args)
    {
        Demo2 d = new Demo2();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}
