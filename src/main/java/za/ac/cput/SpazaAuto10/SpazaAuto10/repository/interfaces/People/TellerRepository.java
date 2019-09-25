package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Teller;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface TellerRepository extends IRepository<Teller, String>
{
    Map<String, Teller> getAll();
}
