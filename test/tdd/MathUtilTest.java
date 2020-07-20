/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static bao.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    @Test //báo cho JVM biết rằng đây là hàm main()
    //trong hàm này chứa các lệnh để test code chính của mình
    //ở bên MathUtil
    //ta test các tình huống thành công ở đây
    //thành công: cF(5) -> ói về 120 gọi là thành công
    public void testSuccessfulCases() {
        //assertEquals(30, 50);
        //tao kkì vọng có 30, xem mày đưa vào thuecj tế là bao nhiêu
        //
        //2 thứ khớp nhau, mày xử lí như dự kiến, đèn xanh, thông đường
        //                        ko như dự kiến, đèn đỏ, code m toang

        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));
        //muốn xanh, thid tất cả phải xanh, đúng hết cho mọi case
        //nếu tất cả xanh, có 1 thằng đỏ, coi như cả đám đỏ
        //vì hàm ý: code khi cahyj đúng cho mọi tình huống
        //ta chỉ cần nhìn xanh đỏ, khỏi cần đỏ từng cháu = mắt
    }

    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu báo cho JVM và thư viện .jar
    //liên quan biết cần phải làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    public void testFailedCases() {
        //kì vọng ném ra ngoại lệ thì coi như code mới ngon
        //vì -5 không tính ! được
        //ngoại lệ không phải là 1 value đề có thể so sánh được
        //nên không thể xài assert được
        //vì hàm này cần 2 value expected và actual
        //trong khi đó ném ra ngoại lệ không phải là actual value để ss
        //ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần ko
        computeFactorial(-5);
        computeFactorial(16); //giai thừa tăng rất nhanh, không chơi quá 15
    }

    //code có thể còn tiềm ẩn lỗi nhưng Clean & Build
    //luôn ra fie .jar nếu code không sai cú pháp
    //vậy thì nguy hiểm quá đi
    //mình phải disable cái nút Clean & Build nếu nút còn màu đỏ
    //TỨC LÀ CÒN ERROR LOGIC
    //NHỚ 2 CON SỐ: 1005 Netbean 8, 1204 Netbean 10 trở lên
    //khi chơi với Ant Project
}
