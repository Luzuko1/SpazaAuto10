package za.ac.cput.SpazaAuto10.SpazaAuto10.service.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;
import java.util.Set;

public interface OwnerService extends IService<Owner, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Owner> getAll();
    Set<Owner>  getAlls();
}
