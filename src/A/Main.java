package A;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myMatrix= new ArrayList<ArrayList<Integer>>();
        BeautifulMatrix matrix= new BeautifulMatrix();
        for(int i=0; i<5; i++){
            ArrayList<Integer> arrayList =new ArrayList<>();
            for( int j=0; j<5; j++){
                arrayList.add(scanner.nextInt());
            }
            myMatrix.add(arrayList);
        }
        matrix.setMatrix(myMatrix);
        int ans =matrix.numOfMoves();
        System.out.println(ans)     ;

    }
}
