package currency;

import java.math.BigDecimal;

public class Coins {

    private String name;
    private BigDecimal value;

    public Coins (String aName, BigDecimal aValue) {
        name = aName;
        value = aValue;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getValue() {
        return this.value;
    }
}
