/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao.util;

/**
 *
 * @author Admin
 */
//đây là classs chứa các hàm toán học, tính toán, với mục tiêu xài chung
//cho các nơi khác, phàm cái gì mang tính chất xài chung, a sẽ dùng STATIC
public class MathUtil {

    //tính n! = 1.2.3...n. Vì n! tăng giá trị rất nhanh, sớm tràn miền int
    //int chỉ tối đa 2 tỷ 1, nên ta cài long mới an tâm
    //thực ra 15! to lắm, nên ta chỉ tính giai thừa từ 15 trở lại
    public static long computeFactorial(int n) {

        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid input, n must be >= 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //Dieu kien dung cua de quy
        //song sot den lenh cho nay thi n chac chan roi vao 2...15
        //ko can else
        return n * computeFactorial(n - 1); //n * (n-1)
    }

}
