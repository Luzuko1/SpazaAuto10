package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Impl.People;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People.CustomerRepositoryImpl;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.CustomerRepository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.CustomerService;

import java.util.Map;
import java.util.Set;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    @Qualifier("CustomerRepository")
    private CustomerRepository customerRepository;
    private static CustomerService customerService = null;

    private CustomerServiceImpl(){this.customerRepository = CustomerRepositoryImpl.getRepository();
    }

    public static CustomerService getCustomerService ()
    {
        if (customerService ==null)
            customerService = new CustomerServiceImpl();
        return customerService;
    }
    @Override
    public Map<String, Customer> getAll()
    {
        return this.customerRepository.getAll();
    }

    @Override
    public Set< Customer> getAlls()
    {
        return null;
    }
    @Override
    public Customer create(Customer customer)
    {
        return this.customerRepository.create(customer);
    }

    @Override
    public Customer update(Customer customer)
    {
        return this.customerRepository.update(customer);
    }

    @Override
    public void delete(String s)
    {
        this.customerRepository.delete(s);
    }

    @Override
    public Customer read(String s)
    {
        return this.customerRepository.read(s);
    }
}
