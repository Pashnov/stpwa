package dto;

public class Product {

    private String id;
    private String name;
    private String description;
    private byte[] photo;

    public Product(String id, String name, String description, byte[] photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getPhoto() {
        return photo;
    }
}
