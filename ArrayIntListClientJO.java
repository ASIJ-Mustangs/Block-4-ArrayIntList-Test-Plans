import java.util.Arrays;

public class ArrayIntListClient {
//worked with Ian (worked on line 108 in ArrayIntList.java)
//Made the > to >= because if you try to do .add() before .remove(), there will be an index out of bounds error.

   public static void main(String[] args) {
       int[] a1 = {0, 1, 4};
       int[] a2 = {-1, 0, 1, 2, 3};
   	 int[] a3 = {-1, -1, 0, 1, 2, 2, 3};
   	 helper(a1, a2);
   	 helper(a2, a3);
   }
   
   public static void helper(int[] elements, int[] expected) {
      ArrayIntList list = new ArrayIntList(elements.length);
   	 for (int i = 0; i < elements.length; i++) {
   	    list.add(elements[i]);
   	 }
   	 list.set(list.size() - 1, 2);
       list.add(0, -1);
       list.add(3);
   	 for (int i = 0; i < expected.length; i++) {
   	    if (list.get(i) != expected[i]) {
   	       System.out.println("fail; expect " + Arrays.toString(expected)
   	                               + ", actual " + list);
         }
         else
            System.out.println("works");
      }
   }
} 