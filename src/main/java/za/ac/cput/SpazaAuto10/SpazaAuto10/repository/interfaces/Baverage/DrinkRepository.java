package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Drinks;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface DrinkRepository extends IRepository<Drinks, String>
{
    Map<String, Drinks> getAll();
}
