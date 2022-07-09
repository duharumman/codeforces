package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int numOfProblems = scanner.nextInt() ,ans=0 ;
        for(int i=0; i<numOfProblems; i++){
            int friendSaysYes=0;
            for(int j=0; j<3;j++) {
                int p= scanner.nextInt();
                if(p>=1){
                    friendSaysYes++;
                }

            }
            if(friendSaysYes>=2){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
