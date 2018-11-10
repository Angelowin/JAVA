import sun.awt.windows.ThemeReader;

/**
 * 需求：卖票。
 *
 * */

//class Ticket extends Thread
//{
//    private static int num = 100;
//    public void run()
//    {
//        while (true) {
//            if (num > 0) {
//                System.out.println(Thread.currentThread().getName() + "....sale...." + num--);
//            }
//        }
//    }
//}
//
//class TicketDemo
//{
//    public static void main(String[] args)
//    {
//        Ticket t1 = new Ticket();
//        Ticket t2 = new Ticket();
//        Ticket t3 = new Ticket();
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}


/**
 * 线程安全问题产生的原因：
 *   1，多个线程在操作共享的数据
 *   2，操作共享数据的线程代码是多余的。
 * */
class Ticket implements Runnable
{
    private int num = 100;
    Object obj = new Object();
    public void run()
    {
        while (num>0) {
            synchronized (obj)
            {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "....sale...." + num--);
                }
            }
        }
    }
}

class TicketDemo
{
    public static void main(String[] args)
    {

        Ticket t = new Ticket();
        Ticket tt = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(tt);
        Thread t4 = new Thread(tt);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
