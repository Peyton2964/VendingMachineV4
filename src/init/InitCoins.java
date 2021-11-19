package init;
import currency.Coins;
import java.math.BigDecimal;

public class InitCoins {
        Coins penny = new Coins ("Penny", new BigDecimal(".01"));
        Coins nickle = new Coins ("Nickle", new BigDecimal(".05"));
        Coins dime = new Coins ("Dime", new BigDecimal(".1"));
        Coins quarter = new Coins ("Quarter", new BigDecimal(".25"));
        Coins dollar = new Coins ("Dollar", new BigDecimal("1"));
        Coins halfDollar = new Coins ("Five", new BigDecimal(".5"));
}
