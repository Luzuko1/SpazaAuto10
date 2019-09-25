package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Airtime;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface AirtimeRepository extends IRepository<Airtime, String>
{
    Map<String, Airtime> getAll();
}
