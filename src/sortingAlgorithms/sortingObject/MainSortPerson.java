package sortingAlgorithms.sortingObject;

public class MainSortPerson {
    public static void main(String[] args) {
        SortPerson sortPerson = new SortPerson(5);
        sortPerson.insert(new Person("Tushar", "Saxena", 18));
        sortPerson.insert(new Person("Tushar", "Saxena", 14));
        sortPerson.insert(new Person("Tushar", "Saxena", 10));
        sortPerson.insert(new Person("Tushar", "Saxena", 78));
        sortPerson.insert(new Person("Tushar", "Saxena", 56));

        System.out.println("List before Sorting:");
        sortPerson.display();

        sortPerson.insertSort();

        System.out.println("List After Sorting:");
        sortPerson.display();
    }
}
