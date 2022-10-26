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
    private float rateOfInterest;
    private float serviceCharge;
    
    public CreditOffer(String bankName, float rateOfInterest, float serviceCharge)
    {
        this.setOfferType(Type.CREDIT);
        this.setBankName(bankName);
        this.setOfferName("No name");
    }
    
    public CreditOffer(String bankName,String offerName, float rateOfInterest, float serviceCharge)
    {
        this.setOfferType(Type.CREDIT);
        this.setBankName(bankName);
        this.setOfferName(offerName);
        
    }
    
    public float getRateOfInterest()
    {
        return this.rateOfInterest;
    }
    
    public void setRateOfInterest(float rateOfInterest)
    {
        this.rateOfInterest = rateOfInterest;
    }
    
    public float getServiceCharge()
    {
        return this.serviceCharge;
    }
    
    public void setServiceCharge(float serviceCharge)
    {
        this.serviceCharge = serviceCharge;
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
