package com.company.test.success;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Pro_Rank_0903_03 {
    //NumberFormat 을 사용해서 입력받은 화폐단위로 바꾸기
    String us;
    String india;
    String china;
    String france;
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /*
          new Locale(language,country) 이미 지정되어 코드를 입력하면
          map에 저장되어 있는 값들을 가져올 수 있다.
          여러가지가 엮여있어 완벽 파악을 힘들었지만, Locale객체를 선언하면서 key값인 "en"과 "IN"을 입력하여 저장되어있는 value를 가져온다.
          language = ko, country = KR 이면 대한민국의 값을 가져온다.

          NumberFormat kr = NumberFormat.getCurrencyInstance(new Locale("ko","KR"));
          대한민국 NumberFormat 이 세팅되고
          kr.format((double) payment);를 사용하면 된다.
        */

        Locale indiaLocale = new Locale("en", "IN");



        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}




