/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tina.mathutil.test.core;

import com.tina.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author oanhn
 */
public class MathUtilTest {
    
   //day la class se su dung cac ham cua thu vien JUnit hay framework Junit 
    //de kiem tra code chinh - ham tinh Factorial (giai thua)
    //core.MathUtil
    //VIET CODE DE TEST CODE CHINH BEN KIA
    
    //co quy tac dat ten ham kiem thu nhung thuong se la: noi len muc dich cua cac case kiem thu
    //tinh huong xai ham theo kieu thanh cong hay that bai
    //@Test Junit se phoi hop voi JVM de chay kich ban test
    //@Test phia hau truong chinh la public static void main()
    //co nhieu @Test ung voi nhieu case khac nhau de kiem thu ham tinh giai thua
    //@Test de cac case chay doc lap voi nhau cung 1 luc
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        //ham chay thanh cong, tra ve ngon
        //ta se xai ham kieu Well dua 5! khong choi -6!, 30!
        int n = 0; // test thu tinh huong tu te dau vao va may phai chay dung
        long expected = 1;
        long actual = MathUtility.getFactorial(n); //goi ham can test ben app chinh
        //so sanh expected vs actual dung framework
        Assert.assertEquals(expected, actual);
        //ham giup so sanh 2 gia tri nao do co giong nhau khong
        //neu giong nhau thi thay mau xanh la, duong thong, code ngon it nhat cho case dang test
        //neu khong giong thi thay mau do, duong khong thong, neu expected vs actual khong giong nhau
        //gop them vai case thanh cong nua/ dau vao ngon va ham van phai tinh ngon
        Assert.assertEquals(1,MathUtility.getFactorial(n));// tui muon 1! == 1
        Assert.assertEquals(2,MathUtility.getFactorial(2));
        Assert.assertEquals(120,MathUtility.getFactorial(5));
        Assert.assertEquals(720,MathUtility.getFactorial(6));
    }
    //ham getFactorial() ta thiet ke co 2 tình huong xu ly
    //tinh huong 1 la dua data tu te trong doan tu 0 den 20 phai tinh dung duoc n! ->done
    //tinh huong 2 la dua data ca chon: am/>20 thi thiet ke ham la nem ra ngoai le
    //TUI KI VONG NGOAI LE XUAT HIEN KHI N<0 || N>20
    //rat mong ngoai le xuat hien voi n ca chon nay
    
    //neu ham nhan vao n<0 hoac n>20 va ham nem ra ngoai le
    //thi ta noi ham chay dung nhu thiet ke => mau xanh phai xuat hien
    
    //neu ham nhan vao n<0 hoac n>20 va ham khong nem ra ngoai le
    //sure keo la ham sai thiet ke, sai ki vong, tra ve mau do
    
    //test case:
    //input -5
    //expected: IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le, ngoai du tinh, du lieu
    //la nhưng thu khong the do luong so sanh theo kieu value
    //ma chi co the do luong = cach chung co xuat hien hay ko
    //assertEquals() ko dung de so sanh 2 ngoai le
    //equals() la bang nhau hay khong tren value!!!
    
    //mau red do ham dung la nem ngoai le that su
    //nhung khong phai la ngoai le nhu ki vong - that su ki vong sai
    // khong phai ham nem sai
    //expected = Illegal ; actual = NumberFormat
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtility.getFactorial(-5); //ham @Test hay ham getFactorial() chay se nem ve ngoai le NumberFormat
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5); //ham @Test hay ham getFactorial() chay se nem ve ngoai le NumberFormat
    }   
    //cach khac de bat ngoai le xuat hien, viet tu nhien hon  VA DUNG LAMBDA
    //lambda expression: chi xay ra khi choi voi ke thua (inheritance/interface)
    //chi xay ra khi choi voi Interface ma chi co duy nhat 1 ham abstract
    //Interface chi co duy nhat 1 ham abstract/ ham khong co code duoc goi la Functional Interface
    
    //ham se nem ve ngoai le neu nhan vao 21 hoac -5
    //tui can thay mau xanh khi choi voi 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
        //MathUtility.getFactorial(-5); //ham @Test hay ham getFactorial() chay se nem ve ngoai le NumberFormat
       //Assert.assertThrows("tham so 1: loai ngoai le muon so sanh","tham so 2: doan code chay vanf ra ngoai runnable");
       Assert.assertThrows(IllegalArgumentException.class,() -> MathUtility.getFactorial(-5));
    } 
    //xem ham co nem ve ngoai le hay khong khi n ca chon
    //neu co nem ra ngoai le thi ham chay dung thiet ke -> mau xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        try {
            //chu dong kiem soat ngoai le
            MathUtility.getFactorial(-5);
        } catch (Exception e) {
            //bat try catch la JUnit se ra xanh do da chu dong kiem soat ngoai le
            //nhung khong chac ngoai le minh can co xuat hien hay ko?
            //co doan code kiem soat dung ngoai le IllegalArgumentException xh
            Assert.assertEquals("n must be between 0 to 20",e.getMessage());
        }
       
    }   
    
}
