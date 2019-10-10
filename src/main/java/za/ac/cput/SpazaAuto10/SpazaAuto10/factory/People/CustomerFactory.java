package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;

public class CustomerFactory
{
    public static Customer getCustomer(String custId, String custName, double shoppingCost )
    {
        return new Customer.Builder()
                .custName(custName).custId(custId)
                .shoppingCost(shoppingCost).build();
    }
}
