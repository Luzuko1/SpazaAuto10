package za.ac.cput.SpazaAuto10.SpazaAuto10.factory;

import za.ac.cput.SpazaAuto10.SpazaAuto10.domain.ResponseObj;

public class ResponseObjFactory
{
    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription) {
        return new ResponseObj(responseCode, responseDescription);
    }
}
