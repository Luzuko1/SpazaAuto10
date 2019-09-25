package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Meat;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface MeatRepository extends IRepository<Meat, String>
{
    Map<String, Meat> getAll();
}

