
package lab_th.pkg5;

import java.util.Scanner;


public class hocmt extends phong {
    int tongsomt;
    public hocmt (){
        super();
    }
    public hocmt(int tongsomt){
        super();
        this.tongsomt=tongsomt;
    }
    int getTongsomt(){
        return tongsomt;
    }
    void setTongsomt(int tongsomt){
        this.tongsomt=tongsomt;
    }
    @Override
    public String tieuchuan(){
        float tc= getDt()/ getTongsomt();
        if(tc>=1.5 &&getDt()/getSobongden()<=10){
         
           return "đạt";
        }
        else{
            return "không đạt";
        }  
        
    }
   
 @Override
    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhập tổng số máy tính");
        tongsomt=sc.nextInt();
    }
    @Override
    public String toString(){
        return super.toString()+"tổng số máy tính "+getTongsomt();
    }
}
