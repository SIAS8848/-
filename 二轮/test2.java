package 二轮;

import java.time.LocalDate;
import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        MyCatCafe catCafe = new MyCatCafe();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new OrangeCat("橘猫",3,"母",200));
        cats.add(new OrangeCat("橘猫",3,"公",200));
        cats.add(new BlackCat("黑猫",3,"母",350));
        catCafe.setCats(cats);
        //初始balance在内部已经设置为1000
        Cat cat1 = new OrangeCat("橘猫",4,"公",200);
        catCafe.buyCat(cat1);
        Cat cat2 = new OrangeCat("黑猫",4,"公",350);
        catCafe.buyCat(cat2);
        Cat cat3 = new OrangeCat("橘猫",5,"公",200);
        catCafe.buyCat(cat3);
//        Cat cat4 = new OrangeCat("黑猫",5,"公",350);//余额不足 抛InsufficientBalanceException异常
//        catCafe.buyCat(cat4);
        //一次只接待一名顾客
        Customer customer1 = new Customer("1号顾客",1,LocalDate.now());
        Customer customer2 = new Customer("2号顾客",2,LocalDate.now());
        Customer customer3 = new Customer("3号顾客",1,LocalDate.now());
        Customer customer4 = new Customer("4号顾客",4,LocalDate.now());
        Customer customer5 = new Customer("5号顾客",3,LocalDate.now());
        catCafe.careCustomer(customer1);
        catCafe.careCustomer(customer2);
        catCafe.careCustomer(customer3);
        catCafe.careCustomer(customer4);
        catCafe.careCustomer(customer5);
        catCafe.freeTime();
    }
}
