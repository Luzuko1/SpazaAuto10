package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Owner;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.OwnerRepository;

import java.util.HashMap;
import java.util.Map;

public class OwnerRepositoryImpl implements OwnerRepository
{
    private static OwnerRepositoryImpl repository = null;
    private Map<String, Owner> owners;


    private OwnerRepositoryImpl()
    {
        this.owners = new HashMap<>();
    }
    public static OwnerRepositoryImpl getRepository()
    {
        if(repository ==null) repository = new OwnerRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String, Owner> getAll()
    {
        return this.owners;
    }

    @Override
    public Owner create(Owner owner)
    {
        this.owners.put(owner.getOwner_ID(),owner);
        Owner savedOwner = this.owners.get(owner.getOwner_ID());
        return savedOwner;
    }

    @Override
    public Owner update(Owner owner)
    {
        this.owners.put(owner.getOwner_ID(),owner);
        Owner savedOwner = this.owners.get(owner.getOwner_ID());
        return savedOwner;
    }

    @Override
    public void delete(String id)
    {
        this.owners.remove(id);
    }

    @Override
    public Owner read(String id)
    {
        Owner owner = this.owners.get(id);
        return owner;
    }
}
