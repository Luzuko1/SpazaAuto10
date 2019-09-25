package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Juice;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface JuiceRepository extends IRepository<Juice, String>
{
    Map<String, Juice> getAll();
}
