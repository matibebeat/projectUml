package fr.efrei.domain;





public class Product {

    private double price;
    private int id;
    private String description;

    private Product() {
    }

    private Product(double price, int id, String description) {
        this.price = price;
        this.id = id;
        this.description = description;
    }


    /*make a builder to build the class*/
    public static class Builder {
        private double price;
        private int id;
        private String description;

        public Builder price(double price) {
            this.price = price;
            return this;
        }


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.price = this.price;
            product.id = this.id;
            product.description = this.description;
            return product;
        }
    }





    @Override
    public String toString() {
        return "Price: " + price;
    }
}
