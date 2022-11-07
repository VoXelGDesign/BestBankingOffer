/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 * Subcalss - represent personal account offer of the bank
 * (specifies type of the offer by using {@link CreditOffer#setOfferType} in the constructor).<p>
 * Extends class: {@link BankingOffer}.<p>
 * Methods added coresponds to specific prameters assigned to the personal account offer.
 * @version 1.0-FINAL
 * @author Jakub Nowakowski
 */
public class PersonalAccountOffer extends BankingOffer {
    
    /**
     * Constructor initializes all parameters below and set offer type to "PERSONAL".
     * @param bankName bank name that have this offer.
     * @param interest specific property for this class.
     * @param monthlyFee specific property for this class.
     */
    public PersonalAccountOffer(String bankName, float interest, float monthlyFee)
    {
        this.setOfferType("PERSONAL");
        this.setBankName(bankName);
        this.setOfferName("No name");
        this.setProperty("Interest", interest);
        this.setProperty("Monthly Fee", monthlyFee);
    }
    
    /**
     * Constructor initializes all parameters below and set offer type to "PERSONAL".
     * @param bankName bank name that have this offer.
     * @param offerName name associated with this offer.
     * @param interest specific property for this class.
     * @param monthlyFee specific property for this class.
     */
    public PersonalAccountOffer(String bankName,String offerName, float interest, float monthlyFee)
    {
        this.setOfferType("PERSONAL");
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Interest", interest);
        this.setProperty("Monthly Fee", monthlyFee);
    }
    
    /**
    * This method gets interest property value tied to {@link PersonalAccountOffer}.
     * @return {@link float} value of interest.
     */
    public float getInterest()
    {
        return this.getPropertyValue("Interest");
    }
    
    /**
     * This method sets interest property value tied to {@link PersonalAccountOffer}.
     * @param interest {@link float} value of interest
     */
    public void setInterest(float interest)
    {
        this.setProperty("Interest", interest);
    }
    
    /**
     * This method gets monthly fee property value tied to {@link PersonalAccountOffer}.
     * @return {@link float} value of monthly fee.
     */
    public float getMonthlyFee()
    {
        return this.getPropertyValue("Monthly Fee");
    }
    
    /**
     * This method sets monthly fee property value tied to {@link PersonalAccountOffer}.
     * @param monthlyFee {@link float} value of monthly fee.
     */
    public void setMonthlyFee(float monthlyFee)
    {
        this.setProperty("Monthly Fee", monthlyFee);
    }   
    
    /**
     * This method compares credit offers and exepction is thrown when offer types do not mach.<p>
     * Exception deatils: {@link TypeException}
     * @param offer offer object to comapre.
     * @return better {@link PersonalAccountOffer} . 
     */
    @Override
     public BankingOffer compareOffers(BankingOffer offer)
     {    
         checkTypeCoherence(this, offer);
         PersonalAccountOffer personalAccOffer = (PersonalAccountOffer) offer;        
         
         if(personalAccOffer.getInterest()*1.5 + personalAccOffer.getMonthlyFee() > this.getInterest()*1.5 + this.getMonthlyFee() ){
             return this;
         }
         else{
             return (PersonalAccountOffer) offer;
         }
         
     }
}