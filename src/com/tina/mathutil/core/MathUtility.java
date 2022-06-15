/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tina.mathutil.core;

/**
 *
 * @author oanhn
 */
public class MathUtility {
        //trong class nay cung cap cho ai do nhieu ham xu ly toan hoc
        //clone class Math cua JDK
        //ham thu vien xai chung cho ai do ma ko can luu lai trang thai
        //chon thiet ke ham la static
        
        //ham tinh giai thua!
        //n! = 1.2.3...n
        //khong co giai thua cho so am
        //0! =1! =1 quy uoc
        //giai thua ham do thi doc dung, tang nhanh ve gia tri
        //20 giai thua 18 con so 0, vua kip du cho kieu long cua Java
        //21 giai thua tran kieu long
        //bai nay quy uoc tinh n! trong khoang tu 0..20
//    public static long getFactorial(int n){
//            if(n <0 || n >20)
//                throw new IllegalArgumentException("Invalid argument.N must be between 0 and 20.");
//            if(n == 0 || n ==1 )
//                return 1; //ket thuc cuoc choi som neu nhan nhung dau vao dac biet
//            long product = 1;// tich nhan don, thuat toan heo dat, oc buu don thit
//            for (int i = 2; i <= n; i++) 
//                product *= i;
//            return product;    
//        }
    //hien tuong goi lai chinh minh voi 1 quy mo khac
    //vd: matryoshka, giống nhau và lồng trong nhau
    //bup be to, nho hon, nho hon nua, nho nho hon nua...den diem dung
    
    //tinh gium tui 6!
    //6! = 1.2.3.4.5.6
    //6! = 5! x 6
    //1! = 1
    //n! =1.2.3.4....n
    //chot ha: n! = n x (n-1)!
     public static long getFactorial(int n){
            if(n<0 || n>20)
                throw new IllegalArgumentException("n must be between 0 to 20");
            if(n == 0 || n ==1 )
                return 1; //ket thuc cuoc choi som neu nhan nhung dau vao dac biet
            return n * getFactorial(n-1);    
        }
    
}
