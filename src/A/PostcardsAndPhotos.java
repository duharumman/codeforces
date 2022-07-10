package A;

import java.util.Scanner;

public class PostcardsAndPhotos {
    private String str ;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public Integer visited(){
        int cnt =1, cnt2= 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                cnt2++;
                if(cnt2==5){
                    cnt2=0;
                    cnt++;
                }
            }
            if(str.charAt(i)!=str.charAt(i+1)){
                cnt++;
                cnt2=0;
            }
        }
        return  cnt ;
    }

    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String s = scanner.next();
        PostcardsAndPhotos  postcardsAndPhotos  = new PostcardsAndPhotos();
        postcardsAndPhotos.setStr(s);

        System.out.println(postcardsAndPhotos.visited());
    }
}
