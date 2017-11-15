/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jhsnehashree
 */
public class TravelAgency {
    
    private ArrayList<Airplane>airplaneCompany;
    public TravelAgency() {
        
        this.airplaneCompany=new ArrayList<Airplane>();
    }

    public ArrayList<Airplane> getAirplaneCompany() {
        return airplaneCompany;
    }

    public void setAirplaneCompany(ArrayList<Airplane> airplaneCompany) {
        this.airplaneCompany = airplaneCompany;
    }
    
    
     public Airplane addAirliner()
    {
         Airplane account=new Airplane();
         airplaneCompany.add(account);
         return account;
    }
   public Airplane searchAirplaneCompany(String airlineCompanyName)
    {
        for(Airplane airlines: airplaneCompany)
            
            if(airlines.getAirlineCompany().equals(airlineCompanyName))
            {
                return airlines;
            }
        return null;
    }
   public Airplane searchFromTo(String searchTo,String searchFrom)
    {
        for(Airplane airlines: airplaneCompany)
            
            if((airlines.getSourcePlace().equals(searchTo)) && (airlines.getDestinationPlace().equals(searchFrom)))
            {
                return airlines;
            }
        return null;
    }
   
      public void deleteAirplane(Airplane airplane_delete)
    {
        airplaneCompany.remove(airplane_delete);
    }
    
}
