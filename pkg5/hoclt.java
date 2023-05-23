
package lab_th.pkg5;

import java.util.Scanner;


public class hoclt extends phong {
    int chon;
    String maychieu;
    public hoclt(){
        super();
    }
    Scanner sc = new Scanner(System.in);
    public hoclt(String maychieu){
        super();
        this.maychieu=maychieu;
    }
    String getMaychieu(){
        return maychieu;
    }
    void setMaychieu(String maychieu){        
        this.maychieu=maychieu;
    }
    @Override
    public String tieuchuan(){
        if(chon== 1&&getDt()/getSobongden()<=10){      
            return "đạt";
        }
        else{
            return "không đạt";
        }
    }
    @Override
    void nhap(){
        super.nhap();
        System.out.println("phòng học có máy chiếu không (1.có/2.không)");
        chon =sc.nextInt();
        switch (chon){
            case 1:
                maychieu= "có";
                break;
            case 2:
                maychieu= "không";
                break;
            default:
                break;
        }
    }
    @Override
    public String toString(){
        return super.toString()+"phòng học "+getMaychieu()+"máy chiếu";
    }
}
