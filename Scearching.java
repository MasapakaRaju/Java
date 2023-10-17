
public class Scearching {
    public static int intScearching(Integer[] arr, Integer key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    public static int StrScearching(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}
