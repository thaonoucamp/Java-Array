package myPackage;

public class Array {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 20;
        // Cách 1 khai báo Array;
        int []arr = new int[3];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;

        System.out.println(arr[2] + arr[1]);

        // Cách 2;
        long[] array = {1, 2, 3, 4, 5};
        System.out.println(array[4]);

        // Hàm check độ dài Mảng;
        System.out.println("Độ dài mảng " + array.length);

        // Cách 3;
        long arrX[] = new long[5];
    }
}
