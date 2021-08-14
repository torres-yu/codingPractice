package com.example.codingpractice.etc;

public class AsciiCode {

    public AsciiCode() {}

    public void ascii() {

        String st = "Torres.yu";
        char[] stToChar = st.toCharArray();

        for(int i = 0; i < st.length() ; i++) {

            stToChar[i] = (char)replaceTo((int)stToChar[i]);
        }

        st = String.valueOf(stToChar);

        st.substring(0,st.length()-1);
        System.out.println(st);
    }

    public int replaceTo(int a) {

        if(a >= 96 && a < 123) a -= 32;
        else a += 32;

        return a;
    }
}
