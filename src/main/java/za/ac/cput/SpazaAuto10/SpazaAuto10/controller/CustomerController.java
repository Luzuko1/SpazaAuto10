package za.ac.cput.SpazaAuto10.SpazaAuto10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.ResponseObj;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.request.NewCustomer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People.CustomerFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.ResponseObjFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.CustomerService;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/SpazaAuto10/customer")
public class CustomerController
{
    @Autowired
    @Qualifier("CustomerServiceImpl")

    private CustomerService service;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createCustomer(@RequestBody NewCustomer customer)
    {
        System.out.println(customer);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(),"Customer created!");
        if (customer.getCustName() == null)
        {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide customer name");

        }else
            {
                Customer savedCustomer = saveCustomer(customer);
                responseObj.setResponse(savedCustomer);
            }
        return ResponseEntity.ok(responseObj);
    }

    private Customer saveCustomer(NewCustomer customer)
    {
        Customer cust = CustomerFactory.getCustomer(customer.getCustId(),customer.getFirstName(),customer.getShoppingCost());
        return service.create(cust);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll()
    {
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(),"Success");
        Set<Customer> customers = service.getAlls();
        responseObj.setResponse(customers);
        return ResponseEntity.ok(responseObj);
    }
}

