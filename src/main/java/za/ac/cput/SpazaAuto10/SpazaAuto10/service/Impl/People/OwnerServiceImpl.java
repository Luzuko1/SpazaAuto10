package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Impl.People;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People.OwnerRepositoryImpl;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.OwnerRepository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.OwnerService;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.TellerService;

import java.util.Map;
import java.util.Set;
@Service
public class OwnerServiceImpl implements OwnerService
{
    @Autowired
    @Qualifier("OwnerRepository")
    private OwnerRepository ownerRepository;
    private static OwnerService ownerService = null;


    private OwnerServiceImpl(){this.ownerRepository = OwnerRepositoryImpl.getRepository();
    }

    public static OwnerService getOwnerService()
    {
        if(ownerService ==null)
            ownerService = new OwnerServiceImpl();
        return ownerService;
    }
//    private Owner search(String mechanicID){
//        return this.owners.stream()
//                .filter(mechanic -> owners.get.trim().equals( mechanicID ) )
//                .findAny()
//                .orElse( null );
//    }
    @Override
    public Map<String, Owner> getAll()
    {
        return null;
    }

    @Override
    public Set<Owner> getAlls()
    {
        return this.ownerRepository.getAlls();
    }

    @Override
    public Owner create(Owner owner)
    {
       return this.ownerRepository.create(owner);
    }

    @Override
    public Owner update(Owner owner)
    {
        return this.ownerRepository.update(owner);
    }

    @Override
    public void delete(String s)
    {
        this.ownerRepository.delete(s);
    }

    @Override
    public Owner read(String s)
    {
        return this.ownerRepository.read(s);
    }
}
