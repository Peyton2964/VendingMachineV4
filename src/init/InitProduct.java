package init;

import product.Products;
import java.math.BigDecimal;

public class InitProduct {

    Products drPepper = new Products (1,"Dr.Pepper", new BigDecimal("1.25"));
    Products cocaCola = new Products (2,"Coca-Cola", new BigDecimal("1.25"));
    Products sprite = new Products (3,"Sprite", new BigDecimal("1.25"));
    Products laysOriginal = new Products (4,"Lays Original", new BigDecimal("1.50"));

}
