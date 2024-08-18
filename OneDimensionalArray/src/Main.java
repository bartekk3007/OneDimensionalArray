import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = new int [10];
        System.out.println(Arrays.toString(array1));
        int[] array2 = {2, 3, 4, 44, 34, 24, 14};
        Arrays.sort(array2);
        array1 = new int[] {1, 2, 3};
        for (int liczba : array2)
        {
            System.out.print(liczba + " ");
        }
        System.out.println(Arrays.toString(array1));

        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA;
        arrayB[0] = 4;
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        int[] arrayC = arrayA.clone();
        arrayC[0] = 5;
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayC));

        for(int i = 0; i < args.length; i++)
        {
            System.out.println("Arguemnt " + i + " to: " + args[i]);
        }

        int[] wyszukiwawcza = {11, 13, 15, 17, 19, 0, 2, 4, 6, 8};
        Arrays.sort(wyszukiwawcza);
        int wyszukiwany = -1;
        int index = Arrays.binarySearch(wyszukiwawcza, wyszukiwany);
        System.out.println(index);
        wyszukiwawcza[-index - 1] = wyszukiwany;
        System.out.println(Arrays.toString(wyszukiwawcza));

        int[] fillArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(fillArr, 10);
        System.out.println(Arrays.toString(fillArr));

        System.out.println(Arrays.equals(wyszukiwawcza, fillArr));
    }
}