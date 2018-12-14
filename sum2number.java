package conghaiso;
import java.util.Scanner;

public class MyBigNumber {
 String result = "";
        int str1 = s1.length(); 
        int str2 = s2.length();
        int max = str1;

        if (str1 > str2) { 
            max = str1;
        } else {
            max = str2;
        }

        int flag = 0; 
        for (int i = 0; i < max; i++) {
            int num1 = str1 - i - 1;
            int num2 = str2 - i - 1;
            char digit1 = '0';
            char digit2 = '0';
            if (num1 >= 0) {
                digit1 = s1.charAt(num1); 
            }
            if (num2 >= 0) {
                digit2 = s2.charAt(num2);
            }
			int temp1 = digit1 - '0';
			int temp2 = digit2 - '0';
            int sum1_2 = temp1 + temp2 + flag; 
            if (num1 > 0) { 
                result += (sum1_2 % 10);
            } else {
                result = sum1_2 + result;
            }
            flag = sum1_2 / 10;
        }
        return result;
    }
}
