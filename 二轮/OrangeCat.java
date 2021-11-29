package ¶þÂÖ;

public class OrangeCat extends Cat{
    protected boolean isFat;

    public OrangeCat(String catName, int age, String sex, double price) {
        super(catName, age, sex, price);
    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}
