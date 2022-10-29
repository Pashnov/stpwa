package view;

import dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductPage implements Page {

    private final Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    @Override
    public String getTitle() {
        return product.getId() + "-" + product.getName();
    }

    @Override
    public Map<String, Object> getContent() {
        Map<String, Object> content = new HashMap<>();
        content.put(DESCRIPTION, product.getDescription());
        content.put(ID, product.getId());
        content.put(NAME, product.getName());
        content.put(PHOTO, product.getPhoto());
        return content;
    }

}
