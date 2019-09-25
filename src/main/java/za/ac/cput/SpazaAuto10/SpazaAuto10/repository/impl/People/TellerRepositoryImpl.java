package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Teller;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.TellerRepository;

import java.util.HashMap;
import java.util.Map;

public class TellerRepositoryImpl implements TellerRepository
{
    private static TellerRepositoryImpl repository= null;
    private Map<String, Teller> tellerMap;

    private TellerRepositoryImpl()
    {
        tellerMap = new HashMap<>();
    }

    public static TellerRepositoryImpl getRepository()
    {
        if(repository==null)
            repository = new TellerRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String, Teller> getAll()
    {
        return null;
    }

    @Override
    public Teller create(Teller teller)
    {
        tellerMap.put(teller.getTellerID(),teller);
        Teller savedPerson = tellerMap.get(teller.getTellerID());
        return savedPerson;
    }

    @Override
    public Teller update(Teller teller)
    {
        tellerMap.put(teller.getTellerID(),teller);
        Teller savedPerson = tellerMap.get(teller.getTellerID());
        return savedPerson;
    }

    @Override
    public void delete(String s)
    {
        tellerMap.remove(s);
    }

    @Override
    public Teller read(String s)
    {
        Teller teller = tellerMap.get(s);
        return teller;
    }
}
