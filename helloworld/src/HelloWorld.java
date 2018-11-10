//import sun.java2d.pipe.SolidTextRenderer;
//
//public class HelloWorld {
//    public static void main(String[] args)
//    {
//        System.out.println("hello worid");
//        int[] arr = new int[]{89,34,6,7};
//        int[] arr2 = {78,23,9};
//        for(int i=0; i<arr.length; i++)
//            System.out.println("arr["+i+"]="+arr[i]+";");
//        System.out.println(arr);
//
//    }
//}


//class ArrayDemo4
//{
//    public static void printArray(int[] arr)
//    {
//        System.out.print("[");
//        for(int i=0; i<arr.length; i++)
//        {
//            if(i!=arr.length-1)
//                System.out.print(arr[i]+",");
//            else
//                System.out.println(arr[i]+"]");
//        }
//    }
//    public static void main(String[] args)
//    {
//        int[] arr ={-83,-29,-43,-55,-21};
//        int max = getMax2(arr);
//        System.out.println("max="+max);
//        selectSort_2(arr);
//        printArray(arr);
//
//        maoPao(arr);
//        printArray(arr);
//
//    }
//
//    /*  2. 获取最大值*/
//    public static int getMax(int[] arr)
//    {
//        int max= arr[0];
//        for(int i=1; i<arr.length;i++)
//        {
//            if(max<arr[i])
//                max=arr[i];
//        }
//        return max;
//    }
//    public static int getMax2(int[] arr)
//    {
//        int maxIndex = 0;
//        for (int i=0;i<arr.length; i++)
//        {
//            if(arr[i]>arr[maxIndex])
//                maxIndex=i;
//        }
//        return arr[maxIndex];
//
//    }
//    /*选择排序法*/
//    public static void selectSort(int[] arr)
//    {
//        for (int i=0; i<arr.length-1; i++)
//        {
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//
//    /*选择排序*/
//    public static void selectSort_2(int[] arr)
//    {
//        for(int i=0; i<arr.length-1; i++)
//        {
//            int num = arr[i];
//            int index = i;
//            for(int j=i+1; j<arr.length;j++)
//                if(num>arr[j])
//                {
//                    num=arr[j];
//                    index=j;
//                }
//            if(index!=i)
//            {
//                int temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//        }
//    }
//
//    /*冒泡排序*/
//    public static void maoPao(int[] arr)
//    {
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=0; j<arr.length-i-1;j++)
//            {
//                if(arr[j]<arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
//}

//查找
class ArrayDemo5
{
    public static void main(String[] args)
    {
        int[] arr = {1,4,6,8,9,10};
        int index = getIndex(arr,8);
        System.out.println("index="+index);
        int index_2 = halfSearch(arr,9);
        System.out.println(index_2);
    }
    /*二分查找*/
    public static int halfSearch(int[] arr,int key)
    {
        int max,min,mid;
        min=0;
        max=arr.length-1;
        mid=(max+min)/2;
        while(arr[mid]!=key)
        {
            if(key>arr[mid])
                min=mid+1;
            else if(key<arr[mid])
                max=mid-1;
            if(max<min)
                return -1;
            mid = (max+min)/2;
        }
        return mid;
    }

    public static int getIndex(int[] arr,int key)
    {
        for(int i=1;i<arr.length; i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}

