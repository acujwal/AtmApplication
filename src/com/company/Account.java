package com.company;

public class Account {


    public static String checkID(String acctNum, Object pwd) {
        String result = "ERROR";
        String a = "123456 mypassword 520.36";
        String b = "654321 anotherpassword 48.20";
        String c = "444444 betterpassword 96.74";

        if (acctNum.equals("123456") && pwd.equals("password")) {
            result = "520.36";
        } else if (acctNum.equals("654321") && pwd.equals("password")) {
            result = "48.20";
        } else if (acctNum.equals("444444") && pwd.equals("password")) {
            result = "96.74";
        }
        System.out.println(result);
        return result;

    }


}
