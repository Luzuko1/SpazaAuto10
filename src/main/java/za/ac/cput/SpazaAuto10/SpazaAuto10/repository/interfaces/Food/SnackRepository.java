package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Food;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Food.Snack;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface SnackRepository extends IRepository<Snack, String>
{
    Map<String, Snack> getAll();
}
