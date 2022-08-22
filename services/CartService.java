package pro.sky.ShoppingCart.services;

import org.springframework.stereotype.Service;
import pro.sky.ShoppingCart.component.Cart;
import pro.sky.ShoppingCart.model.Product;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CartService {
    private final Cart cart;
    public CartService(Cart cart) {
        this.cart = cart;
    }

    public List<Product> add(List<String> productsNems) {
        return cart.add(productsNems.stream().map(Product::new).collect(Collectors.toList()));
    }

    public List<Product> get() {
        return cart.get();
    }
}
