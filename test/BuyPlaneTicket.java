package test;

import java.util.Scanner;

public class BuyPlaneTicket {
    public static void main(String[] args) {
        double price = GetPrice();
        System.out.println(price);

    }

    public static double GetPrice()
    {
        double price;
        int month;
        String SitName;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        month = sc.nextInt();
        System.out.println("请输入原价");
        price = sc.nextDouble();
        System.out.println("请输入头等舱或者经济舱");
        SitName = sc.next();

        if(month>=5&&month<=10)
        {
            if(SitName.equals("头等舱"))
            {
                return price*0.9;
            }
            else if(SitName.equals("经济舱"))
            {
                return price*0.85;
            }
            else
            {
                System.out.println("仓位输入错误");
                return -1;
            }

        }
        else if ((month>=1&&month<=5)||(month>=10&&month<=12))
        {
            if(SitName.equals("头等舱"))
            {
                return price*0.7;
            }
            else if(SitName.equals("经济舱"))
            {
                return price*0.65;
            }
            else
            {
                System.out.println("仓位输入错误");
                return -1;
            }
        }
        else
        {
            System.out.println("月份输入错误");
            return -1;
        }
    }
}
