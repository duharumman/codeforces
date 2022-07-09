package A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Bear{
    public   String name ;
    private int weigh ;

    public Bear() {
    }

    public Bear(String name, int weigh) {
        this.name = name;
        this.weigh = weigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
}
class  Calc{
    public Integer sol(int a , int b ){
        int years=0 ;
        while (a<=b){
            a+=3;
            b++;
            years++;
        }
        return years;
    }
}

public class BearAndBigBrother {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Bear bear1 =new Bear("Limak" , sc.nextInt());
        Bear bear2=new Bear("Bob", sc.nextInt());

        Calc calc = new Calc();
        int ans =calc.sol(bear1.getWeigh(), bear2.getWeigh());
        System.out.println(ans );

    }
}
