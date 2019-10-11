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
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People.OwnerFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.util.Helper;

import static org.junit.Assert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
public class OwnerControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080//SpazaAuto10/**/create/**";
    private static final String SUFFIX = Helper.getSuffixFromClassName(OwnerFactory.class);

    @Test
    public void getOwner() {
        Owner owner = new Owner();
       owner.setOwner_ID(Helper.generateRandomGivenSuffix(SUFFIX));
       owner.setOwnerName("Luzuko");
        ResponseEntity result = restTemplate.withBasicAuth("Luzuko","12345")
                .getForEntity(baseURL+"/getall/",String.class);
       // .postForEntity(baseURL+"/create/",owner, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }
    @Test
    public void createOwner_fail() {
        Owner owner = new Owner();
        owner.setOwner_ID(Helper.generateRandomGivenSuffix(SUFFIX));
        owner.setOwnerName("Luzuko");
        ResponseEntity result = restTemplate.withBasicAuth("lzet","54321")
                .postForEntity(baseURL+"/create/",owner,String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.FORBIDDEN, result.getStatusCode());
    }
    @Test
    public void createCustomer_pass() {
        Owner owner = new Owner();
        owner.setOwner_ID(Helper.generateRandomGivenSuffix(SUFFIX));
        owner.setOwnerName("Luzuko");
        ResponseEntity result = restTemplate.withBasicAuth("Luzuko","12345")
                .postForEntity(baseURL+"/create/",owner,String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }
}
