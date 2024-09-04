/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<SanPham> ds = new ArrayList<>();      
       try {
           
           FileReader rd = new FileReader("sanpham.text");
           BufferedReader br = new BufferedReader(rd);
           String data = null;
           while((data = br.readLine()) !=null)
           {
               // Tạo đối tượng SanPham từ dữ liệu đọc được và thêm vào danh sách
               String[] arr = data.split(";");
               ds.add(new SanPham(arr[0], arr[1], Float.parseFloat(arr[2])));
           }
          
           br.close();
           System.out.println("Da doc xong");
           System.out.println("Ket qua doc duoc");
           for(SanPham x: ds)
           {
               System.out.println(x);
           }
       } catch (Exception ex) {
           System.out.println("Loi xay ra:" + ex.toString());
           System.out.println("Doc file that bai");
       }
       
       }
    }
    

