package ����;

import java.time.LocalDate;
import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        MyCatCafe catCafe = new MyCatCafe();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new OrangeCat("��è",3,"ĸ",200));
        cats.add(new OrangeCat("��è",3,"��",200));
        cats.add(new BlackCat("��è",3,"ĸ",350));
        catCafe.setCats(cats);
        //��ʼbalance���ڲ��Ѿ�����Ϊ1000
        Cat cat1 = new OrangeCat("��è",4,"��",200);
        catCafe.buyCat(cat1);
        Cat cat2 = new OrangeCat("��è",4,"��",350);
        catCafe.buyCat(cat2);
        Cat cat3 = new OrangeCat("��è",5,"��",200);
        catCafe.buyCat(cat3);
//        Cat cat4 = new OrangeCat("��è",5,"��",350);//���� ��InsufficientBalanceException�쳣
//        catCafe.buyCat(cat4);
        //һ��ֻ�Ӵ�һ���˿�
        Customer customer1 = new Customer("1�Ź˿�",1,LocalDate.now());
        Customer customer2 = new Customer("2�Ź˿�",2,LocalDate.now());
        Customer customer3 = new Customer("3�Ź˿�",1,LocalDate.now());
        Customer customer4 = new Customer("4�Ź˿�",4,LocalDate.now());
        Customer customer5 = new Customer("5�Ź˿�",3,LocalDate.now());
        catCafe.careCustomer(customer1);
        catCafe.careCustomer(customer2);
        catCafe.careCustomer(customer3);
        catCafe.careCustomer(customer4);
        catCafe.careCustomer(customer5);
        catCafe.freeTime();
    }
}
