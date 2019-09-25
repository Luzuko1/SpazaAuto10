package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid;

public class Airtime
{
    private String airtimeID;
    private String brand;
    private double amount;
    private double price;


    private Airtime(Airtime.Builder builder)
    {
        this.airtimeID = builder.airtimeID;
        this.amount = builder.amount;
    }

    private Airtime(String airtimeID, String brand, double amount, double pricae)
    {
        this.airtimeID = airtimeID;
        this.brand = brand;
        this.amount = amount;
        this.price = pricae;
    }

    public String getAirtimeID()
    {
        return airtimeID;
    }

    public void setAirtimeID(String airtimeID)
    {
        this.airtimeID = airtimeID;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public double getPricae()
    {
        return price;
    }

    public void setPricae(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Airtime{" +
                "airtimeID=" + airtimeID +
                ", brand='" + brand + '\'' +
                ", amount=" + amount +
                ", pricae=" + price +
                '}';
    }
    public static class Builder{

        private String airtimeID;
        private double amount;

        public Airtime.Builder AirtimeID(String airtimeID)
        {
            this.airtimeID = airtimeID;
            return this;
        }

        public Airtime.Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Airtime build() {
            return new Airtime(this);
        }

    }

}
