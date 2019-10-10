package za.ac.cput.SpazaAuto10.SpazaAuto10.service.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;
import java.util.Set;

public interface CustomerService extends IService<Customer, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Customer> getAll();
    Set<Customer> getAlls();
}
