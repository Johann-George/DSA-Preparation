class Question_2{

  public static int maxValue(int[][] nums){

    int rows = nums.length;
    int cols= nums[0].length;
    int sum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<cols;i++){
      //loop to find the sub matrix
      int[] temp=new int[rows];
      for(int j=i;j<cols;j++){
        //technique to compress the submatrix int 1D array
        for(int k=0;k<rows;k++){
          temp[k]+=nums[k][j];
        }
        //Applying kadane algo on compressed array
        sum=kadane(temp);
        maxSum=Math.max(maxSum,sum);

      }
    }
    return maxSum;

  }

  public static int kadane(int[] arr){
    int cur_sum=arr[0];
    int max_sum=arr[0];
    for(int i=1;i<arr.length;i++){
      if(cur_sum>=0){
        cur_sum+=arr[i];
      }
      else{
        cur_sum=arr[i];
      }
      max_sum=Math.max(max_sum,cur_sum);
    }
    return max_sum;
  }

  public static void main(String[] args){

    Question_2 q2 = new Question_2();
    System.out.println(q2.maxValue(new int[][]{{1,-2,3},{-4,5,-6},{7,-8,9}}));

  }

}
