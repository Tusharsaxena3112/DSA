package arrays;

public class ArrayMain {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(5);
        arrays.insert(9);
        arrays.insert(5);
        arrays.insert(6);
        arrays.insert(7);
        arrays.insert(8);
        arrays.insert(10);


        arrays.sort();
//        System.out.println(arrays.contains(5));
        arrays.display();

        arrays.delete();
        arrays.delete();
        arrays.delete();

        arrays.display();
    }
}
