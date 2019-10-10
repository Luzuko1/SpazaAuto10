package za.ac.cput.SpazaAuto10.SpazaAuto10.service;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.Stock;

import java.util.Map;

public interface StockService extends IService<Stock, String>
{
    //Map<String,Airtime> getAllMTMAirtimes();
    Map<String, Stock> getAll();
}
