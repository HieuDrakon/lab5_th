
package lab_th.pkg5;

import java.util.Scanner;


public class hoctn extends phong {
    String thongtincn,bonrua;
    int succhua,chon;
    Scanner sc = new Scanner(System.in);
    public hoctn(){
        super();
    }
    public hoctn(String thongtincn,int succhua,String bonrua){
        super();
        this.bonrua=bonrua;
        this.succhua=succhua;
        this.thongtincn=thongtincn;
    }
    String getThongtincn(){
        return thongtincn;
    }
    void setThongtincn(String thongtincn){
        this.thongtincn=thongtincn;
    }
    int getSucchua(){
        return succhua;
    }
    void setSucchua(int succhua){
        this.succhua=succhua;
    }
    String getBonrua(){
        return bonrua;
    }
    void setBonrua(String bonrua){
        this.bonrua=bonrua;
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
        System.out.println("nhập thông tin chuyên ngành");
        thongtincn=sc.nextLine();
        System.out.println("nhập sức chứa");
        succhua=sc.nextInt();
        System.out.println("có bồn rửa không (1.có/2.không)");
        chon = sc.nextInt();
        switch(chon){
            case 1:
                bonrua="có ";
                break;
            case 2:
                bonrua="không";
                break;
        }
    }
    @Override
    public String toString(){
        return super.toString()+"thông tin chuyên ngành"+getThongtincn()+"sức chứa "+getSucchua()+getBonrua()+"bồn rửa";
    }
}
