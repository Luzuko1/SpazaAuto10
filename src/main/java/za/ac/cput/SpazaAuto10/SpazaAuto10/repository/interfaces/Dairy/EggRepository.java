package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Egg;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;


public interface EggRepository extends IRepository<Egg, String>
{
    Map<String, Egg> getAll();
}
