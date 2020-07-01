/*This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/


public class Two_Sum
{
    public static void main(String[] args)
    {
        int[] array = {10, 15, 3, 7};
        int target = 17;
        int[] result = TwoSum(array, target);
        System.out.print("Array = [ ");
        for(Integer i:result)
            System.out.print(i+" ");
        System.out.println("]");
    }

    private static int[] TwoSum(int[] array, int target) {
        int[] k = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j] == target) && (i != j)) {
                    k[0] = i;
                    k[1] = j;
                    break;
                }
            }
        }
        return k;
    }
}
