package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Store;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface StoreService extends IService<Store, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Store> getAll();
}
