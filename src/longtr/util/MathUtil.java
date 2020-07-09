/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longtr.util;

/**
 *
 * @author Admin
 */
//class chua cac ham tien ich
//tiện ích nên dùng chung mọi nơi , như hàm thư viện => static
public class MathUtil { 
    public static long computeFactorial(int n){
        long result = 1;
        for (int j = 1; j <= n; j++) {
            result *= j;
        }
        return result;
    }
}
