package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Soda;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface SodaRepository extends IRepository<Soda, String>
{
    Map<String, Soda> getAll();
}
