package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Function;

public class Purchase
{
    private String invoice_ID;
    private String purchaseDate;
    private String custName;

    public Purchase()
    {
    }
    private Purchase(Builder builder)
    {
        this.invoice_ID = builder.invoice_ID;
        this.purchaseDate = builder.purchaseDate;
        this.custName = builder.custName;
    }


    public Purchase(String invoice_ID, String purchaseDate, String custName)
    {
        this.invoice_ID = invoice_ID;
        this.purchaseDate = purchaseDate;
        this.custName = custName;
    }

    public String getInvoice_ID()
    {
        return invoice_ID;
    }

    public void setInvoice_ID(String invoice_ID)
    {
        this.invoice_ID = invoice_ID;
    }

    public String getPurchaseDate()
    {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public String getCustName()
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public static class Builder{

        private String invoice_ID;
        private String purchaseDate;
        private String custName;


        public Builder invoice_ID(String invoice_ID) {
            this.invoice_ID = invoice_ID;
            return this;
        }

        public Builder purchaseDate(String purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }
        public Builder custName(String custName) {
            this.custName = custName;
            return this;
        }

        public Purchase build() {
            return new Purchase(this);
        }

    }
    @Override
    public String toString()
    {
        return "Purchase{" +
                "invoice_ID=" + invoice_ID +
                ", purchaseDate=" + purchaseDate +
                ", custName='" + custName + '\'' +
                '}';
    }
}
