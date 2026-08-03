package interfaces;

import models.Product;

@FunctionalInterface
public interface ProductRule {
    boolean test(Product Product);
}
