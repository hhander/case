package test;

public class FIndPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 101; j <=200 ; j++)
        {

            if(isPrime(j) == true)
            {
                count ++;
                System.out.print(j + " ");
            }
        }
        System.out.println("一共有" + count + "个");

    }


    public static boolean isPrime(int a)
    {
        int i = 2;
        for (; i < a ; i++)
        {
            if(a % i == 0)
            {
                return false;
            }
        }
        if(a == i)
        {
            return true;
        }
        return false;
    }
}
