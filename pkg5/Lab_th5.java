
package lab_th.pkg5;

import java.util.Scanner;


public class Lab_th5 {

    public static void main(String[] args) {
        quanly ql=new quanly();
        int n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("1.nhập /2. xuất /3. danh sách đạt chuẩn / 4. danh sách phòng máy có 60 máy ");
        n=sc.nextInt();
            switch(n){
                case 1: 
                    ql.them();
                    break;
                case 2: 
                    ql.xuat();
                    break;
                case 3: 
                    ql.datchuan();
                    break;
                default: 
                    break;
    }
        }while(n!=0);
}
}
