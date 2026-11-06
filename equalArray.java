/*Question 2:
You are given an integer array nums.
In one move, you may increase the value of any single element nums[i] by 1.
Return the minimum total number of moves required so that all elements in nums become equal.
Example 1:
Input: nums = [2,1,3]
Output: 3
Explanation:
To make all elements equal:
Increase nums[0] = 2 by 1 to make it 3.
Increase nums[1] = 1 by 1 to make it 2.
Increase nums[1] = 2 by 1 to make it 3.
Now, all elements of nums are equal to 3. The minimum total moves is 3.
Example 2:
Input: nums = [4,4,5]
Output: 2
Explanation:
To make all elements equal:
Increase nums[0] = 4 by 1 to make it 5.
Increase nums[1] = 4 by 1 to make it 5.
Now, all elements of nums are equal to 5. The minimum total moves is 2.*/
import java.util.*;


public class equalArray {
  public static void main(String[] arg){
  int[] array = new int[3];
  Scanner scan = new Scanner(System.in);
  System.out.println("please enter your numbers 3 numbers: ");
    int max = array[0];
  for(int i=0;i<array.length;i++){
    array[i]= scan.nextInt();
  }
   System.out.println("Your array is:");
   for (int i = 0; i < array.length; i++) {
    int store = array[i];
    if(store>max){
      max = store;
    }
  }
   System.out.println("the max number is "+max);
   int totalmove = 0;
   for(int i=0; i< array.length;i++){
    totalmove+=max -array[i];
   }
  scan.close();
  }

}
