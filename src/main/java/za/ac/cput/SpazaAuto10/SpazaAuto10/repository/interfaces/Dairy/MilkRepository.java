package za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.Dairy;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Diary.Milk;
import za.ac.cput.SpazaAuto10.SpazaAuto10.repository.interfaces.IRepository;

import java.util.Map;

public interface MilkRepository extends IRepository<Milk, String>
{
    Map<String, Milk> getAll();
}

