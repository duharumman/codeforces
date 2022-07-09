package A;

import java.util.ArrayList;
import java.util.List;

public class BeautifulMatrix {
    private ArrayList <ArrayList <Integer> > matrix = new ArrayList<ArrayList <Integer>>();

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public Integer numOfMoves(){
        for( int i=0 ; i<matrix.size(); i++){
            for (int j=0; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(j).equals(1)){
                    return Math.abs(2-i) +Math.abs(2-j);
                }
            }
        }
        return 0;
    }
}


