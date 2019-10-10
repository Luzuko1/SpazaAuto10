package za.ac.cput.SpazaAuto10.SpazaAuto10.domain.request;

public class NewCustomer
{
    private String phNo, firstName, lastName;

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

    public String getCustId()
    {
        return custId;
    }

    public void setCustId(String custId)
    {
        this.custId = custId;
    }

    private String custName;
    private double shoppingCost;
    private String custId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phNo;
    }

    public void setPhoneNumber(String phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString()
    {
        return "NewCustomer{" +
                "phNo='" + phNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", custName='" + custName + '\'' +
                ", shoppingCost=" + shoppingCost +
                ", custId='" + custId + '\'' +
                '}';
    }
}
