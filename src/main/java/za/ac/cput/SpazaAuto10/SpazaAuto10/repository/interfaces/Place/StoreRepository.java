package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Store;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface StoreRepository extends IRepository<Store, String>
    {
        Map<String, Store> getAll();
    }


