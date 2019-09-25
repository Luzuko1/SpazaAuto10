package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People;

public class Customer
{
    private String custName;
    private double shoppingCost;

    public Customer()
    {
    }

    private Customer(Customer.Builder builder)
    {
        this.custName = builder.custName;
        this.shoppingCost = builder.shoppingCost;
    }
    public Customer(String custName, double shoppingCost)
    {
        this.custName = custName;
        this.shoppingCost = shoppingCost;
    }

    public String getCustName()
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public double getShoppingCost()
    {
        return shoppingCost;
    }

    public void setShoppingCost(double shoppingCost)
    {
        this.shoppingCost = shoppingCost;
    }

    public static class Builder{

        private String custName;
        private double shoppingCost;

        public Customer.Builder custName(String custName)
        {
            this.custName = custName;
            return this;
        }

        public Customer.Builder shoppingCost(double amount) {
            this.shoppingCost = amount;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }

    }

    @Override
    public String toString()
    {
        return "CustomerFactory{" +
                "custName=" + custName +
                ", shoppingCost=" + shoppingCost +
                '}';
    }
}
