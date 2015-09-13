import java.util.Scanner;

/**
 * Created by admin on 13.09.2015.
 */
public class mainClass {
    public static void main(String[] args)
    {
        int SizeArray;
        final int SEED = 1;
        final int ARRAY_SIZE = 10000000;
        Scanner in = new Scanner(System.in);
        SizeArray=in.nextInt();
        Array MyArray= new Array(SizeArray,SEED);
        MyArray.print();
        MyArray.SortArray();
        MyArray.print();

    }
}
