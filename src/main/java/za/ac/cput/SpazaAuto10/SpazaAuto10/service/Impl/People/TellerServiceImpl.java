package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Impl.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Teller;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.People.TellerRepositoryImpl;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.impl.Toiletry.ToiletryRepositoryImpl;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People.TellerRepository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Toiletry.ToiletryRepository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.People.TellerService;

import java.util.Map;

public class TellerServiceImpl implements TellerService
{
    private TellerRepository tellerRepository;
    private static TellerService tellerService = null;

    private TellerServiceImpl(){this.tellerRepository = TellerRepositoryImpl.getRepository();
    }
    public static TellerService getTellerService()
    {
        if (tellerService == null) tellerService = new TellerServiceImpl();
        return tellerService;
    }
    @Override
    public Map<String, Teller> getAll()
    {
        return null;
    }

    @Override
    public Teller create(Teller teller)
    {
        return this.tellerRepository.create(teller);
    }

    @Override
    public Teller update(Teller teller)
    {
        return this.tellerRepository.update(teller);
    }

    @Override
    public void delete(String s)
    {
        this.tellerRepository.delete(s);
    }

    @Override
    public Teller read(String s)
    {
        return this.tellerRepository.read(s);
    }
}
