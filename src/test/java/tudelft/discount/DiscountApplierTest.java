package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscountApplierTest {
    @Test
    void setNewPriceForSingleBusinessProduct() {

        ProductDao mockDao = mock(ProductDao.class);


        Product businessProduct = new Product("Rolex", 10.0, "BUSINESS");
        List<Product> products = Arrays.asList(
                businessProduct
        );

        when(mockDao.all()).thenReturn(products);
        DiscountApplier discountApplier = new DiscountApplier(mockDao);

        discountApplier.setNewPrices();

        Assertions.assertEquals(11.0, businessProduct.getPrice());

    }

    @Test
    void setNewPriceForSingleHomeProduct() {

        ProductDao mockDao = mock(ProductDao.class);


        Product homeProduct = new Product("Lava Lamp", 10.0, "HOME");
        List<Product> products = Arrays.asList(
                homeProduct
        );

        when(mockDao.all()).thenReturn(products);
        DiscountApplier discountApplier = new DiscountApplier(mockDao);

        discountApplier.setNewPrices();

        Assertions.assertEquals(9.0, homeProduct.getPrice());

    }
}
