package za.ac.cput.SpazaAuto10.SpazaAuto10.service.Function;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Function.Purchase;
import za.ac.cput.SpazaAuto10.SpazaAuto10.service.IService;

import java.util.Map;

public interface PurchaseService extends IService<Purchase, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Purchase> getAll();
}
