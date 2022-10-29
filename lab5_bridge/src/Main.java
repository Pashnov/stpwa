import dto.Product;
import renderer.HtmlRenderer;
import renderer.JsonRenderer;
import renderer.Renderer;
import renderer.XmlRenderer;
import view.Page;
import view.ProductPage;
import view.SimplePage;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Page simplePage = new SimplePage("title", "content");

        Product product = new Product("id", "p_name", "some_desc", "array_of_bytes_of_photo".getBytes());
        Page productPage = new ProductPage(product);

        List<Renderer> allRenders = Arrays.asList(new HtmlRenderer(), new JsonRenderer(), new XmlRenderer());

        for (Renderer render : allRenders) {
            System.out.println("simplePage");
            System.out.println(render.render(simplePage));
            System.out.println("productPage");
            System.out.println(render.render(productPage));
        }
    }
}