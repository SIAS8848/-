package ����;

import java.util.ArrayList;

public class MyCatCafe implements CatCafe {
	private double balance = 1000;
	private ArrayList<Cat> cats;//è
	private ArrayList<Customer> customers = new ArrayList<>();//����
	private ArrayList<Customer> customers2 = new ArrayList<>();//��������

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Cat> getCats() {
		return cats;
	}

	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Customer> getCustomers2() {
		return customers2;
	}

	public void setCustomers2(ArrayList<Customer> customers2) {
		this.customers2 = customers2;
	}

	@Override
	public void buyCat(Cat cat) {
		if (balance >= cat.price) {
			balance = balance - cat.price;
			System.out.println("������һֻè");
			cats.add(cat);
			System.out.println("���Ϊ��" + balance);

		} else {
			throw new InsufficientBalanceException("����");
		}

	}

	@Override
	public void careCustomer(Customer customer) {
		customers.add(customer);

		for (int i = 0; i < customer.count; i++) {
			if (cats.isEmpty()) {
				throw new CatNotFoundException("����ûè��");
			}
			if (!cats.isEmpty()) {
				customers2.add(customer);
				balance += 15;
				int j = (int) (Math.random() * (cats.size() ));
				System.out.println(customer.getCustomerName() + "������èΪ��");
				System.out.println(cats.get(j).toString());

			}
		}
	}
//	@Override
//    public void careCustomer(Customer customer) {
//        customers.add(customer);
//
//        for(int i=0;i<customer.count;i++){
//            if(cats.isEmpty()){
//                throw new CatNotFoundException("����ûè��");
//            }
//            if(!cats.isEmpty()){
//                customers2.add(customer);
//                balance+=15;
//                int j = 0+(int)(Math.random()*(cats.size()+1-0));
//                System.out.println(customer.getCustomerName()+"������èΪ:");
//                System.out.println(cats.get(j).toString());
//                Cat remove = cats.remove(j);
//                customer.cat = remove;
//            }
//        }
//    }

	@Override
	public void freeTime() {
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		System.out.println("��������Ϊ" + customers2.size() * 15);
	}
}
