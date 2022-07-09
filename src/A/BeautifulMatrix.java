package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulMatrix {
    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public  Integer numOfMoves() {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j).equals(1)) {
                    return Math.abs(2 - i) + Math.abs(2 - j);
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myMatrix = new ArrayList<ArrayList<Integer>>();
        BeautifulMatrix matrix = new BeautifulMatrix();
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                arrayList.add(scanner.nextInt());
            }
            myMatrix.add(arrayList);
        }
        matrix.setMatrix(myMatrix);
        int ans = matrix.numOfMoves();
        System.out.println(ans);

    }
}