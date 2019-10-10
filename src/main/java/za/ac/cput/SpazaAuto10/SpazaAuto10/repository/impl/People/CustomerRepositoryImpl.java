package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People;

import org.springframework.stereotype.Repository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

@Repository("CustomerRepository")
public class CustomerRepositoryImpl implements CustomerRepository
{
    private static CustomerRepositoryImpl repository = null;
    private Map<String, Customer> customerMap;

    private CustomerRepositoryImpl()
    {
        this.customerMap = new HashMap<>();
    }

    public static CustomerRepository getRepository()
    {
        if(repository == null)
            repository = new CustomerRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String, Customer> getAll()
    {
        return this.customerMap;
    }

    @Override
    public Customer create(Customer customer)
    {
        this.customerMap.put(customer.getCustName(),customer);
        Customer savedCust = this.customerMap.get(customer.getCustName());
        return savedCust;
    }

    @Override
    public Customer update(Customer customer)
    {
        this.customerMap.put(customer.getCustName(),customer);
        Customer savedCust = this.customerMap.get(customer.getCustName());
        return savedCust;
    }

    @Override
    public void delete(String s)
    {
        this.customerMap.remove(s);
    }

    @Override
    public Customer read(String s)
    {
        Customer customer = this.customerMap.get(s);
        return customer;
    }
}
