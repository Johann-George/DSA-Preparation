class Question_1{

  public static int maxValue(int[] nums){

    int sum=0;
    int maxSum=0;
    for(int i=0;i<nums.length;i++){
          sum=nums[i];
          maxSum=nums[i];
      //2nd loop to compute sum with each index as starting index
      for(int j=i+1;j<nums.length+i;j++){
        //condition to check if sum is +ve or zero
        if(sum>=0){
          sum+=nums[j%nums.length];
        }
        //condition for -ve values of sum
        else{
          sum=nums[j%nums.length];
        }
        //compute max of subarray
        maxSum=Math.max(sum,maxSum);
      } 
    }
    return maxSum;
  }

  public static void main(String[] args){

    Question_1 q1 = new Question_1();
    System.out.println(q1.maxValue(new int[]{1,-2,-3,4}));

  }

}
