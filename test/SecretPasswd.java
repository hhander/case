package test;

import java.util.Scanner;

public class SecretPasswd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        System.out.println("请输入密码长度");
        n = sc.nextInt();
        int[] passwd = new int[n];

        for (int i = 0; i < passwd.length; i++)
        {
            System.out.println("请输入第" + (i + 1) + "位密码");
            passwd[i] = sc.nextInt();
            passwd[i] = (passwd[i]+5) % 10;
        }

        int left = 0;
        int right = passwd.length - 1;
        while(left < right)
        {
            int tmp = passwd[left];
            passwd[left] = passwd[right];
            passwd[right] = tmp;
            left++;
            right--;
        }

        Score.print(passwd);


    }
}
