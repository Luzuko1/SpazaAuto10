package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Store;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Place.StoreRepository;

import java.util.HashMap;
import java.util.Map;

public class StoreRepositoryImpl implements StoreRepository
{
    private static StoreRepositoryImpl repository = null;
    private Map<String, Store> stores;

    private StoreRepositoryImpl()
    {
        this.stores = new HashMap<>();
    }
    public static StoreRepositoryImpl getRepository()
    {
        if(repository ==null) repository = new StoreRepositoryImpl();
        return repository;
    }


    @Override
    public Map<String,Store> getAll()
    {
        return null;
    }

    @Override
    public Store create(Store store)
    {
        return null;
    }

    @Override
    public Store update(Store store)
    {
        return null;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Store read(String s)
    {
        return null;
    }
}

