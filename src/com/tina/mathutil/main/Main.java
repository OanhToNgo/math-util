/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tina.mathutil.main;

import com.tina.mathutil.core.MathUtility;

/**
 *
 * @author oanhn
 */
public class Main {
    public static void main(String[] args) {
        //thu nghiem ham tinh giai thua xem co chay dung nhu thiet ke hay khong
        //ta phai dua ra cac tinh huong su dung ham trong thuc te
        //vi du: -5, 0, 20,21 coi tinh ra bao nhieu
        //TEST CASE: mot tinh huong ham/app/man hinh/tinh nang duoc dua vao su dung
        //gia lap hanh vi xai cua ai do!!
        //TEST CASE: LA 1 TINH HUONG SU DUNG, XAI APP MA NO BAO HAM DATA DAU VAO CU THE NAO DO
        //OUTPUT DAU RA UNG VOI XU LI CUA HAM/CHUC NANG CUA APP, DI NHIEN DUNG DAU VAO DE XU LI
        //KI VONG: MONG HAM SE TRA VE VALUE NAO DO UNG VOI INPUT O TREN
        //SO SANH DE XEM KET QUA CO NHU KI VONG HAY KO
        long expected = 120;// ki vong ra 120 neu tinh 5!
        int n = 5;//input, test case
        long actual = MathUtility.getFactorial(n);
        System.out.println("5!= "+ expected +" expected");
        System.out.println("5!= " +actual+" actual");
        
        
        
            
    }
    
}
