import java.util.Random;

/**
 * Created by admin on 13.09.2015.
 */
public class Array {
    private  int c[];
    private  int   N;


    public Array(int _N, long seed) {
        Random rnd = new Random(seed);
        N=_N;
        c = new int[N];
        for (int i = 0; i < N; ++i) {
            c[i] = rnd.nextInt();

        }

    }
    public void SortArray(){
        for(int i=0; i<N-1; i++){
            int min = c[i];
            int numberMin = i;
            for(int j=i+1; j < N; j++ )
                if(c[j] <= min){
                    min = c[i];
                    numberMin = j;
                }
            if(numberMin != i){
                c[numberMin] = c[i];
                c[i] = min;
            }
        }
    }
    public  void print() {
        for (int i = 0; i < N; ++i) {

            System.out.print("\t" + c[i]);
        }
        System.out.println();
    }
    public int Size(){
        return N;
    }

    public int getElement(int index){
        return c[index];
    }

}
