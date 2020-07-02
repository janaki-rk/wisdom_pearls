/*This problem was recently asked by: Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of
 all the numbers in the original array except the one at i.*/

public class Product_Array
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = ProductArray(array);
        System.out.print("[ ");
        for(Integer i:result)
            System.out.print(i+" ");
        System.out.println("]");

    }

    private static int[] ProductArray(int[] array)
    {
        int[] base = {0};
        if(array.length==1)
            return base;

        int[] left=new int[array.length];
        int[] right=new int[array.length];
        int[] prod=new int[array.length];

        left[0]=1;
        right[array.length-1]=1;

        for(int i=1;i<array.length;i++)
            left[i]=array[i-1]*left[i-1];

        for(int j=array.length-2;j>=0;j--)
            right[j]=array[j+1]*right[j+1];

        for(int k=0;k<array.length;k++)
            prod[k]=left[k]*right[k];

        return prod;


    }
}
