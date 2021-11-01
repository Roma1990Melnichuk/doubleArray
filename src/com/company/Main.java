package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        String s;
        for (int i = 0; i <5 ; i++) {
            s = reader.readLine();
            strings.add(s);
        }
        strings = doub(strings);
        for (int i = 0; i < strings.size(); i++) {
            out.println(strings.get(i));
        }
    }
    public static ArrayList<String> doub(ArrayList<String> strings){
        ArrayList<String> x2 = new ArrayList<String>();
        String by2;
        for (int i = 0; i < strings.size(); i++) {
            by2 =strings.get(i);
            for (int j = 0; j < 2; j++) {
                x2.add(by2);
            }



        }
        return x2;
    }

}
