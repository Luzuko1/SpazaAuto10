package za.ac.cput.SpazaAuto10.Controller;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.Application;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Customer;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People.CustomerFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

import static junit.framework.TestCase.assertEquals;

@SpringBootTest(classes = Application.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
public class CustomerControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080//SpazaAuto10/**/create/**";
    private static final String SUFFIX = Helper.getSuffixFromClassName(CustomerFactory.class);

    @Test
    public void getCustomer()
    {
        Customer customer = new Customer();
        customer.setCustName("Luzuko");
        ResponseEntity result = restTemplate.withBasicAuth("Luzuko","12345")
                .getForEntity(baseURL+"/getall/",String.class);
        //.postForEntity(baseURL+"/create/",emp, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }


}
