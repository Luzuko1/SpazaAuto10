package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Diary;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Dairy;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface DairyService extends IService<Dairy, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Dairy> getAll();
}
