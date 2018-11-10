/**
建立一个用于操作数组的工具类，其中包含了常见的数组操作，如：最值，排序等。
@author 张三
@version V1.0
*/

public class ArrayTool
{
    private ArrayTool(){}//该类的方法都是静态的，所以该类不需要创建对象的，为了保证不让其他程序创建该类的对象
                         //可以将构造的函数私有化
    /**
     获取数组中的最大值
     @param arr 接收一个元素为int类型的数组。
     @return 该数组的最大的元素值
     */
    public static int getMax(int[] arr)
    {
        int maxIndex = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    /**
     对数组进行选择排序。
     @param arr 接收一个元素为int类型的数组。
     */
    public static void selectSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
        }
    }
    /**
     交换数组中数的位置
     */
    private static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    /** 将数组转化为字符串*/
    public static String arrayToString(int[] arr)
    {
        String str = "[";
        for(int i=0; i<arr.length; i++)
        {
            if(i!=arr.length-1)
                str = str+arr[i]+",";
            else
                str = str+arr[i]+"]";
        }
        return str;
    }
    /**获取数组中最大值的索引*/
    public static int getIndex(int[] arr,int a)
    {
        int index = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==a)
                index=i;
        }
        return index;
    }
}
