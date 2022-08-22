package pro.sky.ShoppingCart.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.ShoppingCart.model.Product;
import pro.sky.ShoppingCart.services.CartService;

import java.util.List;


@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping(path = "/add")
    public List<Product> addProduct(@RequestParam("/id") List<String> productsNam) {
        return cartService.add(productsNam);
    }

    @GetMapping(path = "/get")
    public List<Product> getProduct() {
        return cartService.get();
    }
    }
