package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface CustomerRepository extends IRepository<Customer, String>
{
    Map<String, Customer> getAll();
}

