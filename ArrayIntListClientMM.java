public class ArrayIntListClient {
    public static void main(String[] args) {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList(39);

        // we write an add method to make things easier
        list1.add(11);
        list1.add(-2);
        list1.add(1);
        list2.add(28);
        list2.add(14);
        list2.add(58);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.get(2));
        System.out.println(list2.get(2));
        list1.set(0,100);
        list2.set(0,100);
        System.out.println(list1);
        System.out.println(list2);
        list1.clear();
        System.out.println(list1);
        System.out.println(list2.indexOf(14));
        System.out.println(list2.contains(14));
        System.out.println(list2.contains(10000));
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());
        
    }
}
