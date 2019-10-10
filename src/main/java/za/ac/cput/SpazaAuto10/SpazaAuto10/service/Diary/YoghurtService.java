package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Diary;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Yoghurt;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface YoghurtService extends IService<Yoghurt, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Yoghurt> getAll();
}
