public class SearchingDemo {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6 };
        String[] sarr = { "one", "two", "three" };
        System.out.println(Scearching.intScearching(new Integer[] { 1, 2, 3, 4, 5, 6 }, 5));
        System.out.println(Scearching.intScearching(arr, 0));
        System.out.println(Scearching.StrScearching(new String[] { "one", "two", "three" }, "three"));
        System.out.println(Scearching.StrScearching(sarr, "key"));

        // Object
        System.out.println(ObjectSearch.ObjectSearching(arr, 6));
    }
}
