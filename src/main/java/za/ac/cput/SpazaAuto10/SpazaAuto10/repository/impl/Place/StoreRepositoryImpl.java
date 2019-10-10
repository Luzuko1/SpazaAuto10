package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Store;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Place.StoreRepository;

import java.util.HashMap;
import java.util.Map;

public class StoreRepositoryImpl implements StoreRepository
{
    private static StoreRepositoryImpl repository = null;
    private Map<String, Store> storeMap;

    private StoreRepositoryImpl()
    {
        this.storeMap = new HashMap<>();
    }

    public static StoreRepository getRepository()
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
        this.storeMap.put(store.getStore_name(),store);
        Store savedStore = this.storeMap.get(store.getStore_name());
        return savedStore;
    }

    @Override
    public Store update(Store store)
    {
        this.storeMap.put(store.getStore_name(),store);
        Store savedStore = this.storeMap.get(store.getStore_name());
        return savedStore;
    }

    @Override
    public void delete(String s)
    {
        this.storeMap.remove(s);
    }

    @Override
    public Store read(String s)
    {
        Store store = this.storeMap.get(s);
        return store;
    }
}

