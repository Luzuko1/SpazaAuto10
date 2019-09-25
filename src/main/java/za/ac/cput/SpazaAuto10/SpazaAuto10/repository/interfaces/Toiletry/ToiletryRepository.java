package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Toiletry;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Toiletry.Toiletry;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface ToiletryRepository extends IRepository<Toiletry, String>
{
    Map<String, Toiletry> getAll();
}
