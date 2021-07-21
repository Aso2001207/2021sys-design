package pkg32A;

import java.util.Scanner;
import java.util.Random;

public class Mainsenkan2 {
    public static void main(String[] args){
        Random r=new Random();
        int pointx1=r.nextInt(5);
        int pointy1=r.nextInt(5);
        int pointx2=r.nextInt(5);
        int pointy2=r.nextInt(5);
        int pointx3=r.nextInt(5);
        int pointy3=r.nextInt(5);

        //それぞれの戦艦のインスタンス作成
        Ship2 sen1=new Ship2(3,pointx1,pointy1);
        
        Ship2 sen2=new Ship2(3,pointx2,pointy2);
        
        Ship2 sen3=new Ship2(3,pointx3,pointy3);
        

        sen1.pointdecide(pointx1,pointy1);
        sen2.pointdecide(pointx2,pointy2);
        sen3.pointdecide(pointx3,pointy3);
        
        //hpが０になるまで繰り返す
        int nowhp1=3;
        int nowhp2=3;
        int nowhp3=3;
        while(nowhp1!=0 && nowhp2!=0 && nowhp3!=0){
        Scanner scanner=new Scanner(System.in);
        System.out.println("爆弾のx座標を入力してください");
        int num1=scanner.nextInt();
        System.out.println("爆弾のｙ座標を入力してください");
        int num2=scanner.nextInt();
        nowhp1=sen1.attack(num1,num2);
        nowhp2=sen2.attack(num1,num2);
        nowhp3=sen3.attack(num1,num2);
        }
    }    

}
