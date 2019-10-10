package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;
import java.util.Set;

public interface OwnerRepository extends IRepository<Owner, String>
{
    Map<String, Owner> getAll();
    Set<Owner> getAlls();
}
