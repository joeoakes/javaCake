class BirthdayCake extends Cake {
    private boolean hasCandles;

    public BirthdayCake(String flavor, int layers, double price, boolean hasCandles) {
        super(flavor, layers, price);
        this.hasCandles = hasCandles;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice();
        if (hasCandles) {
            total += 5.0; // Additional cost for candles
        }
        return total;
    }
}
