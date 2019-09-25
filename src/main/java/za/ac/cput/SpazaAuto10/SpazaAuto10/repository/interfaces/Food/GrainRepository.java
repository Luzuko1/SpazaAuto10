package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Grain;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface GrainRepository extends IRepository<Grain, String>
{
    Map<String, Grain> getAll();
}
