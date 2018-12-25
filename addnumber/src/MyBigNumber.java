package addnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả: linh
 * DesCription.
 * Class MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi.
 * Hàm sum là hàm để thực hiện phép cộng 2 chuỗi số.
 */
public class MyBigNumber {

    private IReceiver ireceiver;
    public String er = "";

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**
     * Hàm dùng để cộng 2 số. Trong đó đưa vào 2 chuỗi số chỉ chứ kí tự từ 0-9.
     *
     * @param str1 chuỗi số thứ nhất.
     * @param str2 chuỗi số thứ hai.
     */
    public String sum(final String str1, final String str2) {
        int pos;
        String step = "";
        String process = "";
        String sum = "";//tao ra biến lưu kết quả
        Pattern pattern = Pattern.compile("\\D"); // Chuỗi đại diện cho kí tự số từ [0-9]
        final Matcher isError1 = pattern.matcher(str1);// biến để lưu dữ kết quả xét chuỗi s1 
        final Matcher isError2 = pattern.matcher(str2);;// biến để lưu dữ kết quả xét chuỗi s2
        int remember = 0;//tạo ra biến lưu số để nhớ nếu kết quả cộng lớn hơn 10
        int numSum = 0; // biến dùng để lưu kết qua phép cộng của từng kì tụ trong chuỗi

        char char1 = '0';
        char char2 = '0';

        // bắt lỗi dữ liệu nhập vào nếu có
        //kiểm tra người dùng có nhập đủ input ch
        if (str1.isEmpty()) {
            pos = 1;
            er = "chuổi thứ nhất chưa nhập";
            throw new ExNumberFormatException(pos);
        }

        if (str2.isEmpty()) {
            pos = 1;
            er = "chuổi thứ 2 chưa nhập";
            throw new ExNumberFormatException(pos);
        }

        // Kiểm tra số âm
        if (str1.charAt(0) == '-') {
            pos = 1;
            er = str1;
            throw new ExNumberFormatException(pos);
        }

        if (str2.charAt(0) == '-') {
            pos = 1;
            er = str2;
            throw new ExNumberFormatException(pos);
        }

        // Kiểm tra kí tự đặc biệt
        if (isError1.find()) {
            pos = isError1.start() + 1;
            er = str1;
            throw new ExNumberFormatException(pos);
        }

        if (isError2.find()) {
            er = str2;
            pos = isError2.start() + 1;
            throw new ExNumberFormatException(pos);

        }
        int leng1 = str1.length();
        int leng2 = str2.length();
        int max =  (leng1 > leng2) ? leng1 : leng2; // lưu giá trị length của chuổi dài nhất
        int i = 0; //biến đếm cho vòng lặp
        for (i = 1; i <= max; i++) { // chạy vòng lặp để tham chiếu đến từng kí tự của chuổi
            char1 = ((leng1 - i) >= 0) ? str1.charAt(leng1 - i) : '0'; // nếu chuổi 1 hết ta sẽ ghi 0
            char2 = ((leng2 - i) >= 0) ? str2.charAt(leng2 - i) : '0'; //nếu chuổi 2 hết ta sẽ ghi 0

            numSum = (char1 - '0') + (char2 - '0') + remember;
            sum = Integer.toString(numSum % 10) + sum; //ghi kết quả cộng vào biến kết quả

            //lưu phần nhớ là 1 nếu kết quả cộng lớn hơn 10 
            remember = numSum / 10;

            // kiểm tra xem có phần nhớ hay không
            if (remember == 1) {
                if (str2.length() - i >= 0) {
                    process = "bước " + i + ": lấy " + char1 + " cộng " + char2 + " cộng " 
                        + remember + " được " + numSum + ", ghi " + numSum % 10 + ", nhớ " + remember + "\n";
                } else {
                    process = "bước " + i + ", lấy " + char1 + " cộng " + remember 
                        + " được " + numSum + ", ghi " + numSum % 10 + ", nhớ " + remember + "\n";
                }
            } else {
                if (str2.length() - i >= 0) {
                    process = "bước " + i + ": lấy " + char1 + " cộng " 
                        + char2 + " được " + numSum + ", ghi " + numSum % 10 + "\n";
                } else {
                    process = "bước " + i + ": lấy " + char1 + " cộng 0" 
                        + " được " + numSum + ", ghi " + numSum % 10 + "\n";
                }
            }

            step = step + process;
        }

        // ghi phần nhớ vào nếu phép cộng vượt số
        // VD 999+99=1098
        if (remember == 1) {
            sum = Integer.toString(remember) + sum;
            step = step + "bước " + i + ", lấy " + remember + " ghi trước kết quả\n";
        }
        step = step + "kết quả cuối cùng là " + sum;

        this.ireceiver.send(step);// gửi các bước đến ireceiver để in ra màn hình

        // trả về kết quả của phép cộng
        
        return sum;
    }
}
