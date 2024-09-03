package LeetCode.Question4;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <=2){
            return nums.length;
        }
        int k = 2;

        for(int i =2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,1,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("Array is: ");
        for(int a : arr){
            System.out.print(a+"\t");
        }
        System.out.println();
        System.out.println("Array after use remove duplicates method is: ");
        for(int i = 0; i<k; i++){
            System.out.print(arr[i]);
        }
    }
}
