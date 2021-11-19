package product;

import java.math.BigDecimal;

public class Drinks {

    private int prodNumber;
    private String product;
    private BigDecimal price;

    public Drinks (int aProdNumber, String aProdName, BigDecimal aPrice) {
        prodNumber = aProdNumber;
        product = aProdName;
        price = aPrice;
    }

    public void setProdNumber(int aProdNum) {
        prodNumber = aProdNum;
    }

    public void setProduct(String aProdName) {
        product = aProdName;
    }

    public void setPrice(BigDecimal aPrice) {
        price = aPrice;
    }

    public int getProdNumber() {
        return this.prodNumber;
    }

    public String getProduct() {
        return this.product;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
