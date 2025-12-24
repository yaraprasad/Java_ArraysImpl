package com.arrays.basic.find.missing.number;

public class FindMissingNumRandomArray {

    public  static  int findSmallestMissing (int[] nums){
        int n= nums.length;

       /* System.out.println(" Input Array : "+ Arrays.stream(nums)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" , ")));*/
        //Step 1 : place numbers in their correct positions.
        for (int i = 0; i < n ; i++) {

            while (nums[i] >=1 &&
            nums[i] <=n &&
            nums[nums[i] - 1] != nums[i]){

                int correctIndex = nums[i] -1;
                int temp = nums[i];
                nums[i]= nums[correctIndex];
                nums[correctIndex] = temp;

            }
           /* System.out.println(" for "+(i+1)+" iteration Arrays : "+ Arrays.stream(nums)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining(" , ")));*/
        }


        //step 2 : Find the first missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i+1){
                return i+1;
            }
        }

        //step 3: if all numbers are present
        return n+1;
    }

    public static void main(String[] args) {

        System.out.println(findSmallestMissing(new int[] {4,1,5,6,10,2}));  //3
        System.out.println(findSmallestMissing(new int[] {9,8,20}));        //1
        System.out.println(findSmallestMissing(new int[] {1,2,4,3}));       //5
    }
}
