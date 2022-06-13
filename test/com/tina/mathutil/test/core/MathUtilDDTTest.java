/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tina.mathutil.test.core;

import com.tina.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author oanhn
 */
@RunWith(value = Parameterized.class)// t noi vs may rang la tao se bien cai class nay thanh tham so hoa
//cau lenh nay cua Junit bao hieu rang se can loop qua tap data de lay cap data input/expected nhoi vao ham test
public class MathUtilDDTTest {
    @Parameterized.Parameters //JUnit se ngam chay loop qua tung dong cua mang de lay ra duoc cap data input/expected
                              // ten ham khong quan trong, quan trong la @
    public static Object[][] initData(){
        //ham nay ta se tra ve mang 2 chieu gom nhieu cap expected input
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120}, 
                                {6,120}
        };
    }
    //gia su loop qua tung dong cua mang, ta van can gam tung value cua cot vao bien tuong ung input, expected de lat hoi feed cho ham
    @Parameterized.Parameter(value = 0) // la map voi mang data
    public int n; // bien map voi value cua cot 0 cua mang
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kieu long vi gia tri tra ve cua ham getF() la long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected,MathUtility.getFactorial(n));
    }
 
    
}
