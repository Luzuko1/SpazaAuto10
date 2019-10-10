package za.ac.cput.SpazaAuto10.SpazaAuto10.service.People;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.People.Teller;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface TellerService extends IService<Teller, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Teller> getAll();
}
