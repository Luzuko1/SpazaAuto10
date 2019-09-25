package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Warehouse;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface WarehouseRepository extends IRepository<Warehouse, String>
{
    Map<String, Warehouse> getAll();
}
