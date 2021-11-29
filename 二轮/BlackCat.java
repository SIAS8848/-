package ¶þÂÖ;

public class BlackCat extends Cat{
    public BlackCat(String catName, int age, String sex, double price) {
        super(catName, age, sex, price);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
