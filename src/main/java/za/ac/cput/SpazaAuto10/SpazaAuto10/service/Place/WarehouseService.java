package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Warehouse;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface WarehouseService extends IService<Warehouse, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Warehouse> getAll();
}
