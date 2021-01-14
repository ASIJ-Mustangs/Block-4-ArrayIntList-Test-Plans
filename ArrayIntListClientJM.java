import java.util.Arrays;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // we write an add method to make things easier
        list1.add(11);
        list1.add(-2);
        list1.add(1000);
        System.out.println(list1);
        System.out.println(list1.indexOf(11));
        System.out.println(list1.contains(-2));
        list1.clear();
        System.out.println(list1);
        list2.add(200);
        System.out.println(list2.contains(11));
        System.out.println(list2.isEmpty());

        ArrayIntList list3 = new ArrayIntList();
        System.out.print(list3);
        int[] a1 = {4, 6, 9, 20, 34};
        int[] a2 = { 7, 45, 2, 39, 5};
        helper(a1, a2);
    }

    public static void helper(int[] elements, int[] expected){
        ArrayIntList list = new ArrayIntList();
        for (int i = 0; i < elements.length; i++){
            list.add(elements[i]);
        }
        list.remove(5);
        list.add(3,56);
        list.add(5,23);
        for (int i = 0; i < expected.length; i++){
            if (list.get(i) != expected[i]){
                System.out.println("fail; expect " + Arrays.toString(expected) + ", actual " + list);
            }
        }
    }
}
