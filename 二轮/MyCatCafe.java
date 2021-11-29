package 二轮;

import java.util.ArrayList;

public class MyCatCafe implements CatCafe {
	private double balance = 1000;
	private ArrayList<Cat> cats;//猫
	private ArrayList<Customer> customers = new ArrayList<>();//纪念
	private ArrayList<Customer> customers2 = new ArrayList<>();//计算利润

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
			System.out.println("买入了一只猫");
			cats.add(cat);
			System.out.println("余额为：" + balance);

		} else {
			throw new InsufficientBalanceException("余额不足");
		}

	}

	@Override
	public void careCustomer(Customer customer) {
		customers.add(customer);

		for (int i = 0; i < customer.count; i++) {
			if (cats.isEmpty()) {
				throw new CatNotFoundException("店内没猫了");
			}
			if (!cats.isEmpty()) {
				customers2.add(customer);
				balance += 15;
				int j = (int) (Math.random() * (cats.size() ));
				System.out.println(customer.getCustomerName() + "摸到的猫为：");
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
//                throw new CatNotFoundException("店内没猫了");
//            }
//            if(!cats.isEmpty()){
//                customers2.add(customer);
//                balance+=15;
//                int j = 0+(int)(Math.random()*(cats.size()+1-0));
//                System.out.println(customer.getCustomerName()+"摸到的猫为:");
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
		System.out.println("今天利润为" + customers2.size() * 15);
	}
}
