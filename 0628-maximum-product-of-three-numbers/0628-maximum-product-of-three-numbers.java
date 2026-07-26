class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = -1000, max2 = -1000, max3 = -1000;
        int min1 = 0, min2 = 0;

        for(int temp : nums){

            if(max1 <= temp){
                max3 = max2;
                max2 = max1;
                max1 = temp;
            }
            else if(max2 <= temp){
                max3 = max2;
                max2 = temp;
            }
            else if(max3 <= temp){
                max3 = temp;
            }

            if(min1 >= temp){
                min2 = min1;
                min1 = temp;
            }
            else if(min2 >= temp){
                min2 = temp;
            }
        }

        return Math.max(
            max1 * max2 * max3,
            min1 * min2 * max1
        );
    }
}