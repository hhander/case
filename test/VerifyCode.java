package test;

import java.util.Random;
import java.util.Scanner;

public class VerifyCode {
    public static void main(String[] args) {
        System.out.println(CreateVerifyCode(5));
    }

    public static String CreateVerifyCode(int n)
    {
        Random r = new Random();
        String code = "";

        for (int i = 0; i < n; i++)
        {
            int type = r.nextInt(0,3);
            switch (type)
            {
                case 0:
                    code = code + (char)(r.nextInt(65,91));
                    break;
                case 1:
                    code = code + (char)(r.nextInt(97,123));
                    break;
                case 2:
                    code = code + r.nextInt(10);

            }
        }
        return code;
    }

}

