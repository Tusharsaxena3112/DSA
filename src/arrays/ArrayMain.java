package arrays;

public class ArrayMain {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(5);
        arrays.insert(1);
        arrays.insert(5);
        arrays.insert(4);
        arrays.insert(2);
        arrays.insert(8);


        arrays.sort();

        //System.out.println(arrays.isSorted());
//        System.out.println(arrays.contains(5));
//        arrays.display();
//
//        arrays.delete();
//        arrays.delete();
//        arrays.delete();
//        arrays.delete();
//
//        arrays.display();

//        System.out.println(arrays.search(3));
        System.out.println(java.util.Arrays.toString(arrays.withoutDuplicates()));
    }
}
