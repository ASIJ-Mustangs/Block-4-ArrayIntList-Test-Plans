package src;

public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // we write an add method to make things easier
        list1.add(11);
        list1.add(-2);
        list1.add(1000);
        
        System.out.println(list1);
        list1.add(1,27);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        System.out.println(list1.contains(-2));
        System.out.println(list1.contains(49));
        System.out.println(list1.contains(27));
        System.out.println(list1.indexOf(27));
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1);
        list1.add(1,25);
        System.out.println(list1);
        list1.remove(10);
        
    }
}
