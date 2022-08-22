package pro.sky.ShoppingCart.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.ShoppingCart.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope

public class Cart {
   private  final List<Product> products;

   public Cart() {
      this.products = new ArrayList<>();
   }

   public List<Product> add(List<Product> products) {
      this.products.addAll(products);
      return this.products;
   }
   public List<Product> add(Product product) {
      products.add(product);
      return products;
   }

   public List<Product> get() {
      return Collections.unmodifiableList(products);
   }
}
