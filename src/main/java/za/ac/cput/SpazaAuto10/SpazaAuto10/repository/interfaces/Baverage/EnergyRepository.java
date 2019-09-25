package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Baverage;


import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.baverage.Energy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface EnergyRepository extends IRepository<Energy, String>
{
    Map<String, Energy> getAll();
}
