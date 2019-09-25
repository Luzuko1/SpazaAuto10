package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Airtime;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Prepaid.AirtimeRepository;

import java.util.HashMap;
import java.util.Map;

public class AirtimeRepositoryImpl implements AirtimeRepository
{

    private static AirtimeRepositoryImpl repository = null;
    private Map<String, Airtime> airtimeMap;

    private AirtimeRepositoryImpl()
    {
        this.airtimeMap = new HashMap<>();
    }

    public static AirtimeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new AirtimeRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String,Airtime> getAll()
    {
        return null;
    }

    @Override
    public Airtime create(Airtime airtime)
    {
        airtimeMap.put(airtime.getAirtimeID(),airtime);
        Airtime savedAirtime = airtimeMap.get(airtime.getAirtimeID());
        return savedAirtime;
    }

    @Override
    public Airtime update(Airtime airtime)
    {
        airtimeMap.put(airtime.getAirtimeID(),airtime);
        Airtime savedAirtime = airtimeMap.get(airtime.getAirtimeID());
        return savedAirtime;
    }

    @Override
    public void delete(String s)
    {
        airtimeMap.remove(s);
    }

    @Override
    public Airtime read(String s)
    {
        Airtime airtime = airtimeMap.get(s);
        return airtime;
    }
}
