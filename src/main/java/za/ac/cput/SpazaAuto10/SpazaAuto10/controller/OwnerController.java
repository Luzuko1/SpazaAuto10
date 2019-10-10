package za.ac.cput.SpazaAuto10.SpazaAuto10.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.ResponseObj;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.request.NewOwner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.People.OwnerFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.factory.ResponseObjFactory;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.Impl.People.OwnerServiceImpl;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.OwnerService;


import java.util.Map;
import java.util.Set;
@RestController
@RequestMapping("/SpazaAuto10/owner")
public class OwnerController
{
    @Autowired

    private OwnerService ownerService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createOwner (@RequestBody NewOwner owner)
    {
        System.out.println(owner);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(),"Owner created");
        if (owner.getOwnerName() == null)
        {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide owner name!");
        } else {
            Owner savedOwner = saveOwner(owner);
            responseObj.setResponse(savedOwner);
        }
        return ResponseEntity.ok(responseObj);
    }
    private Owner saveOwner(NewOwner owner) {
        Owner owner1 = OwnerFactory.getOwner(owner.getOwnerName());
        return ownerService.create(owner1);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Owner> owners = ownerService.getAlls();
        responseObj.setResponse(owners);
        return ResponseEntity.ok(responseObj);
    }
}
