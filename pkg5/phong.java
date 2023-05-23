
package lab_th.pkg5;

import java.util.Scanner;


public class phong {
    String maphong;
    int sobongden;
    float dt;
    String daynha;
   public phong() {
        super();
    }
    public phong(String maphong,int sobongden,float dt,String daynha){
        super();
        this.daynha=daynha;
        this.dt=dt;
        this.maphong=maphong;
        this.sobongden=sobongden;
    }
    String getMaphong(){
        return maphong;
    }
    void setMaphong(String maphong){
        this.maphong=maphong;
    }
    String getDaynha(){
        return daynha;
    }
    void setDaynha(String daynha){
        this.daynha=daynha;
    }
    int getSobongden(){
        return sobongden;
    }
    void SetSobongden(int sobongden){
        this.sobongden=sobongden;
    }
    float getDt(){
        return dt;
    }
    void setDt(float dt){
        this.dt=dt;
    }
    public String tieuchuan(){
   return"";
       
    }
    void nhap(){      
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã phòng");
        maphong=sc.nextLine();
        System.out.println("nhập dãy nhà");
        daynha=sc.nextLine();
        System.out.println("nhập diện tích");
        dt=sc.nextFloat();
        System.out.println("nhập số bóng đèn");
        sobongden=sc.nextInt();
    }
    @Override
 public String toString(){
        return "mã phòng"+getMaphong()+"dãy nhà"+getDaynha()+"diện tích"+getDt()+"số bóng đèn"+getSobongden()+"phòng "+tieuchuan()+"tiêu chuần";
    }
}
