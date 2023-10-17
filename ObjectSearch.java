public class ObjectSearch {
    public static int ObjectSearching(Object[] arr, Object key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}
