
package lab_th.pkg5;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly {
    ArrayList<hoclt> lt =new ArrayList();
    ArrayList<hoctn> tn =new ArrayList();
    ArrayList<hocmt> mt =new ArrayList();
    int plt,pmt,ptn;
    void quanly(){
   }
    Scanner sc = new Scanner(System.in);
   public void them(){
        System.out.println("Nhập số phòng học lý thuyết thêm vào: ");
        plt =sc.nextInt();
        for(int i=1;i<=plt;i++){
            System.out.println("Nhập lần thứ : "+i);
            hoclt hlt=new hoclt();
            hlt.nhap();
            lt.add(hlt);
        }
        System.out.println("Nhập số phòng máy tính thêm vào: ");
        pmt=sc.nextInt();
        for(int i=1;i<=pmt;i++){
            System.out.println("Nhập lần thứ : "+i);
            hocmt hmt=new hocmt();
            hmt.nhap();
            mt.add(hmt);
        }
        System.out.println("Nhập số phòng thí nghiệm thêm vào: ");
        ptn=sc.nextInt();
        for(int i=1;i<=ptn;i++){
            System.out.println("Nhập lần thứ : "+i);
            hoctn htn=new hoctn();
            htn.nhap();
            tn.add(htn);
        }
        
        
}
   
}