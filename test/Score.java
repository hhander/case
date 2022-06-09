package test;

import java.util.Arrays;
import java.util.Random;

public class Score {
    public static void main(String[] args) {
        int[] score = new int[6];
        Random r = new Random();
        for (int i = 0; i < score.length; i++)
        {
            score[i] = r.nextInt(60,101) ;
        }
        print(score);
        mySort(score);
        System.out.println();
        print(score);
        int sum = 0;

        for (int j = 1; j < score.length - 1; j++)
        {
            sum = sum + score[j];
        }
        int avg = sum / (score.length - 2);

        System.out.println("总分为" + sum + "平均分" + avg);

    }



    public static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mySort(int[] arr)
    {
        int h = 1;
        while(h<(arr.length/2))
        {
            h = 2*h + 1;
        }

        while(h>0)
        {
            for (int i = h; i < arr.length; i++)
            {
                for (int j = i; j >= h; j -= h)
                {
                    if (arr[j - h] > arr[j])
                    {
                        int tmp = arr[j - h];
                        arr[j - h] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            h = h/2;
        }
    }

}
