package ¶þÂÖ;

public abstract class Cat {
    protected String catName;
    protected int age;
    protected String sex;
    protected double price;

    public Cat(String catName, int age, String sex, double price) {
        this.catName = catName;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }
    public abstract String toString();

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
