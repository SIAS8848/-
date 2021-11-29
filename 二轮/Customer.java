package ¶þÂÖ;

import java.time.LocalDate;

public class Customer {
    protected String customerName;
    protected int count;
    protected Cat cat;
    protected LocalDate arrayTime;

    public Customer(String customerName, int count, LocalDate arrayTime) {
        this.customerName = customerName;
        this.count = count;
        this.arrayTime = arrayTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public LocalDate getArrayTime() {
        return arrayTime;
    }

    public void setArrayTime(LocalDate arrayTime) {
        this.arrayTime = arrayTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", count=" + count +
                ", arrayTime=" + arrayTime +
                '}';
    }
}
