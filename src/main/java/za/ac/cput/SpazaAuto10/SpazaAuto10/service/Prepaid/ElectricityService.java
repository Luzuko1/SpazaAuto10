package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Prepaid;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Prepaid.Electricity;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface ElectricityService extends IService<Electricity, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Electricity> getAll();
}
