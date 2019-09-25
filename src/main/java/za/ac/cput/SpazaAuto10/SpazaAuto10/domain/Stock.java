package za.ac.cput.SpazaAuto10.SpazaAuto10.domain;

public class Stock
{
    private String stock_ID;
    private String stock_item;
    private int quantity;

    public Stock()
    {
    }

    private Stock(Builder builder)
    {
        this.stock_ID = builder.stock_ID;
        this.stock_item = builder.stock_item;
        this.stock_ID = builder.stock_ID;
    }

    public Stock(String stock_ID, String stock_item, int quantity)
    {
        this.stock_ID = stock_ID;
        this.stock_item = stock_item;
        this.quantity = quantity;
    }

    public String getStock_ID()
    {
        return stock_ID;
    }

    public void setStock_ID(String stock_ID)
    {
        this.stock_ID = stock_ID;
    }

    public String getStock_item()
    {
        return stock_item;
    }

    public void setStock_item(String stock_item)
    {
        this.stock_item = stock_item;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }


    public static class Builder{

        private String stock_ID;
        private String stock_item;
        private int quantity;

        public Builder stock_ID(String stock_ID) {
            this.stock_ID = stock_ID;
            return this;
        }

        public Builder stock_item(String stock_item) {
            this.stock_item = stock_item;
            return this;
        }
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Stock build() {
            return new Stock(this);
        }

    }
    @Override
    public String toString()
    {
        return "Stock{" +
                "stock_ID=" + stock_ID +
                ", stock_item='" + stock_item + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
