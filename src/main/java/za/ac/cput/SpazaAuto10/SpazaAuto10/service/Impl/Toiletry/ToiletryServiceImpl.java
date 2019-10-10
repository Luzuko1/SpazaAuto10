package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Impl.Toiletry;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry.Toiletry;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Toiletry.ToiletryRepository;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.Toiletry.ToiletryService;

import java.util.Map;

public class ToiletryServiceImpl implements ToiletryService
{
    private ToiletryRepository toiletryRepository;
    private static ToiletryService toiletryService = null;

    private ToiletryServiceImpl()
    {

    }
    @Override
    public Map<String, Toiletry> getAll()
    {
        return null;
    }

    @Override
    public Toiletry create(Toiletry toiletry)
    {
        return null;
    }

    @Override
    public Toiletry update(Toiletry toiletry)
    {
        return null;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Toiletry read(String s)
    {
        return null;
    }
}
