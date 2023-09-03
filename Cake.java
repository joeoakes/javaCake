abstract class Cake {
    private String flavor;
    private int layers;
    private double price;

    public Cake(String flavor, int layers, double price) {
        this.flavor = flavor;
        this.layers = layers;
        this.price = price;
    }

    // Abstract method to calculate the total cost of the cake
    public abstract double calculateTotalPrice();

    // Getters and setters for private fields
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
