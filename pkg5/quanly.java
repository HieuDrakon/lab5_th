
package lab_th.pkg5;

import java.util.ArrayList;
import java.util.Scanner;


public class quanly {
    //ArrayList<phong> p =new ArrayList();
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
        public void xuat(){
            int chon ;
            System.out.println("mời chọn xuất thông tin lớp học(1.lớp lý thuyết / 2.lớp máy tính / 3. lớp thí nghiệm / 4. toàn bộ phòng ) ");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                       for(int i=0;i<lt.size();i++){
                           System.out.println(lt.get(i).toString());
                       }
                       break;
                case 2:
                       for(int i=0;i<mt.size();i++){
                           System.out.println(mt.get(i).toString());
                       }
                       break;
                case 3:
                       for(int i=0;i<tn.size();i++){
                           System.out.println(tn.get(i).toString());
                       }
                       break;
                case 4:
                       for(int i=0;i<lt.size();i++){
                           System.out.println(lt.get(i).toString());
                       }
                       for(int i=0;i<mt.size();i++){
                           System.out.println(mt.get(i).toString());
                       }
                       for(int i=0;i<tn.size();i++){
                           System.out.println(tn.get(i).toString());
                       }
                default:
                    break;
            }
        }
        public void datchuan(){
            String tclt=null;
            String tcmt=null;
            String tctn=null;
           for(int i=0;i<lt.size();i++){
            if(lt.get(i).tieuchuan().equals("đạt")){
                tclt = lt.get(i).toString();
            }
            else
            {
                tclt ="phòng lý thuyết không có phòng nào";
            }
           }
           for(int i=0;i<mt.size();i++){
            if(mt.get(i).tieuchuan().equals("đạt")){
                tcmt= mt.get(i).toString();
            }
            else{
                tcmt="phòng máy tính không có phòng nào";
            }
           }
           for(int i=0;i<tn.size();i++){
            if(tn.get(i).tieuchuan().equals("đạt")){
                tctn= tn.get(i).toString();
            }
            else{
                tctn="phòng thí nghiệm không có phòng nào";
            }
           }
           
            System.out.println("danh sách phòng đạt tiêu chuẩn:");
            System.out.println(""+tclt);
            System.out.println(""+tcmt);
            System.out.println(""+tctn);
        }
        void phong60may(){
            String tcmt=null;
           for(int i=0;i<mt.size();i++){
            if(mt.get(i).getTongsomt()==60){
                tcmt= mt.get(i).toString();
            }
            else{
                tcmt="không có phòng nào";
            }
           }
            System.out.println("danh sách phòng có 60 máy tính:");
            System.out.println(""+tcmt);            
        }
        void edit(){
            for(int i=0;i<mt.size();i++){
                System.out.println("nhập mã phòng");
                String mp ;
                        mp=sc.nextLine();
                if(mt.get(i).getMaphong().equals(mp)){
                    
            }
        }
        
}
}
