package com.company.test.success;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pro_Rank_0904_06 {
    //Valid Username Regular Expression
    //정규식을 사용해서 로그인 아이디 체크 만들기


    private static final Scanner scan = new Scanner(System.in);
    class UsernameValidator {
        /*
         * Write regular expression here.
         */
        //첫 글자는 [a-zA-Z]허용 \\w (word표현으로 [a-zA-z_]허용)
        //{7,29}  최소 8~30글자(처음 ^사용으로 인하여 -1개씩 해줘야한다)
        // $ 사용으로 끝남을 표시
        public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    }


    public  void solution() {

            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }

        }
    }


}
