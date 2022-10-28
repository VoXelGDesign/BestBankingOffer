/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 *
 * @author tryne
 */
public class CreditOffer extends BankingOffer
{
    
  
    
    public CreditOffer(String bankName, float rateOfInterest, float serviceCharge)
    {
        this.setOfferType("CREDIT");
        this.setBankName(bankName);
        this.setOfferName("No name");
        this.setProperty("Rate of Interest", rateOfInterest);
        this.setProperty("Service Charge", serviceCharge);
    }
    
    public CreditOffer(String bankName,String offerName, float rateOfInterest, float serviceCharge)
    {
        this.setOfferType("CREDIT");
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Rate of Interest", rateOfInterest);
        this.setProperty("Service Charge", serviceCharge);
    }
    
    public float getRateOfInterest()
    {
        return this.getPropertyValue("Rate of Interest");
    }
    
    public void setRateOfInterest(float rateOfInterest)
    {
        this.setProperty("Rate of Interest", rateOfInterest);
    }
    
    public float getServiceCharge()
    {
        return this.getPropertyValue("Service Charge");
    }
    
    public void setServiceCharge(float serviceCharge)
    {
        this.setProperty("Service Charge", serviceCharge);
    }   
    
    
     public CreditOffer compareOffers(CreditOffer offer)
     {    
         if(offer.getRateOfInterest()*20000 + offer.getServiceCharge() > this.getRateOfInterest()*20000 + this.getServiceCharge() ){
             return this;
         }
         else{
             return offer;
         }
         
     }
     
     
    
}
