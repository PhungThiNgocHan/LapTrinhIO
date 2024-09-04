/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT02;

import BT01.SanPham;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
       ds.add(new SanPham("SP01", "Gao", 25000));
       ds.add(new SanPham("SP02", "Duong", 45000));
       ds.add(new SanPham("SP03", "Keo", 29000));
       
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Nhap danh sach tu ban phim
            for (int i = 0; i < 3; i++) {
                System.out.println("Thong tin san pham thu nhat" + (i + 1));
                System.out.println("Nhap ma so:");
                String maso = sc.nextLine();
                System.out.println("Nhap ten:");
                String ten = sc.nextLine();
                System.out.println("Nhap gia");
                float gia = sc.nextFloat();
                sc.nextLine();
                SanPham sp = new SanPham(maso, ten, gia);
                ds.add(sp);
            }
            //ghi danh sach san pham ra tap tin
            oos.writeObject(ds);
           // Dong luong
           oos.close();
           System.out.println("\n Da ghi xong");
       
       } catch (Exception ex){
           System.out.println("Loi xay ra:" + ex.toString());
       }
    }  
}
