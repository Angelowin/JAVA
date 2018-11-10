public class ArrayToolDemo
{
    public static void main(String[] args)
    {
        int[] arr= {3,6,9,7,10,50};
        int max = ArrayTool.getMax(arr);
        System.out.println("max="+max);
        int index = ArrayTool.getIndex(arr,7);
        System.out.println("index = "+index);
    }
}
