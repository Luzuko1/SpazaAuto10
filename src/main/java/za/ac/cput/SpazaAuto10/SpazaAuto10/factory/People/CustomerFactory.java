package za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;

public class CustomerFactory
{
    public static Customer getCustomer(String custName, double shoppingCost)
    {
        return new Customer.Builder()
                .custName(custName)
                .shoppingCost(shoppingCost).build();
    }
}
