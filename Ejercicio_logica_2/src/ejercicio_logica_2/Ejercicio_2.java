
package ejercicio_logica_2;


public class Ejercicio_2 {
    
    public int searchInsert(int[] nums, int target) {
     for (int i = 0; i < nums.length; i++) {
         if (nums[i] >= target) {
            System.out.println(i);
            return i;
            
         }
     }
     return nums.length;
    }
    
}
