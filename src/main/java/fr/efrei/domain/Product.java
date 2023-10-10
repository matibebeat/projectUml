package fr.efrei.domain;





public class Product {

    private double price;
    private int id;
    private String description;

    private Product() {
    }

    private Product(Builder builder) {
        this.price = builder.price;
        this.id = builder.id;
        this.description = builder.description;
    }

    public double getPrice() {
        return price;
    }

    public Builder setPrice(double newPrice) {
        price = newPrice;
        return this;
    }


    public int getId() {
        return id;
    }

    public Builder setId(int newId) {
        id = newId;
        return this;
    }


    public String getDescription() {
        return description;
    }


    public Builder setDescription(String newDescription) {
        description = newDescription;
        return this;
    }

    public Builder copy(Product product) {
        price = product.getPrice();
        id = product.getId();
        description = product.getDescription();
    }

    public Product build() {
        return new Product(this);
    }

    @Override
    public String toString() {
        return "Price: " + price;
    }
}
