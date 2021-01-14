public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();

        // we write an add method to make things easier
        System.out.println(list1.isEmpty());
        list1.add(11);
        list1.add(-2);
        list1.add(1000);
        list1.add(-2);
        System.out.println(list1);
        System.out.println(list1.indexOf(10002));
        System.out.println(list1.contains(-23));
        System.out.println(list1.isEmpty());
    }
}
