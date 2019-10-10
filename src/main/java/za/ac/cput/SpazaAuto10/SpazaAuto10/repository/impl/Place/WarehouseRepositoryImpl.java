package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Place;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Place.Warehouse;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Place.WarehouseRepository;

import java.util.Map;

public class WarehouseRepositoryImpl implements WarehouseRepository
{
    private static WarehouseRepositoryImpl repository = null;
    private Map<String, Warehouse> warehouseMap;


    private static WarehouseRepository getRepository()
    {
        if(repository==null)
            repository = new WarehouseRepositoryImpl();
        return repository;
    }
    @Override
    public Map<String, Warehouse> getAll()
    {
        return null;
    }

    @Override
    public Warehouse create(Warehouse warehouse)
    {
        this.warehouseMap.put(warehouse.getWarehouse_name(),warehouse);
        Warehouse savedCust = this.warehouseMap.get(warehouse.getWarehouse_name());
        return savedCust;
    }

    @Override
    public Warehouse update(Warehouse warehouse)
    {
        this.warehouseMap.put(warehouse.getWarehouse_name(),warehouse);
        Warehouse savedCust = this.warehouseMap.get(warehouse.getWarehouse_name());
        return savedCust;
    }

    @Override
    public void delete(String s)
    {
        this.warehouseMap.remove(s);
    }

    @Override
    public Warehouse read(String s)
    {
        Warehouse warehouse = this.warehouseMap.get(s);
        return warehouse;
    }
}

