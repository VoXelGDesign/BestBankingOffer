/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingofferweb.model;

/**
 * Subcalss - represent credit offer of the bank (specifies type of the offer by
 * using {@link CreditOffer#setOfferType} in the constructor)
 * .<p>
 * Extends class: {@link BankingOffer}
 * .<p>
 * Methods added coresponds to specific prameters assigned to the credit offer.
 *
 * @version 3.0-FINAL
 * @author Jakub Nowakowski
 */
public class CreditOffer extends BankingOffer {

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - CREDIT.
     *
     * @param bankName bank name that have this offer.
     * @param rateOfInterest specific property for this class.
     * @param serviceCharge specific property for this class.
     */
    public CreditOffer(String bankName, float rateOfInterest, float serviceCharge) {
        this.setOfferType(OfferType.CREDIT);
        this.setBankName(bankName);
        this.setOfferName("No name");
        this.setProperty("Rate of Interest", rateOfInterest);
        this.setProperty("Service Charge", serviceCharge);
    }

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - CREDIT.
     *
     * @param bankName bank name that have this offer.
     * @param offerName name associated with this offer.
     * @param rateOfInterest specific property for this class.
     * @param serviceCharge specific property for this class.
     */
    public CreditOffer(String bankName, String offerName, float rateOfInterest, float serviceCharge) {

        this.setOfferType(OfferType.CREDIT);
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Rate of Interest", rateOfInterest);
        this.setProperty("Service Charge", serviceCharge);

    }

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - CREDIT.
     *
     * @param bankName bank name that have this offer.
     * @param offerName name associated with this offer.
     * @param rateOfInterest specific property for this class.
     * @param serviceCharge specific property for this class.
     * @param description offer description.
     */
    public CreditOffer(String bankName, String offerName, float rateOfInterest, float serviceCharge, String description) {

        this.setOfferType(OfferType.CREDIT);
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Rate of Interest", rateOfInterest);
        this.setProperty("Service Charge", serviceCharge);
        this.setDescription(description);
    }

    /**
     * This method gets rate of interest property value tied to
     * {@link CreditOffer}.
     *
     * @return {@link float} value of rate of interest.
     */
    public float getRateOfInterest() {
        return this.getPropertyValue("Rate of Interest");
    }

    /**
     * This method sets rate of interest property value tied to
     * {@link CreditOffer}.
     *
     * @param rateOfInterest {@link float} value of rate of interest.
     */
    public void setRateOfInterest(float rateOfInterest) {
        this.setProperty("Rate of Interest", rateOfInterest);
    }

    /**
     * This method gets service charge property value tied to
     * {@link CreditOffer}.
     *
     * @return {@link float} value of service charge.
     */
    public float getServiceCharge() {
        return this.getPropertyValue("Service Charge");
    }

    /**
     * This method sets service charge property value tied to
     * {@link CreditOffer}.
     *
     * @param serviceCharge {@link float} value of service charge.
     */
    public void setServiceCharge(float serviceCharge) {
        this.setProperty("Service Charge", serviceCharge);
    }

    /**
     * This method compares credit offers and exepction is thrown when offer
     * types do not mach.<p>
     * Exception deatils: {@link TypeException}
     *
     * @param offer offer object to comapre.
     * @return better {@link CreditOffer} or if offers are the same - null .
     */
    @Override
    public BankingOffer compareOffers(BankingOffer offer) {
        checkTypeCoherence(this, offer);
        CreditOffer creditOffer = (CreditOffer) offer;
        //28000 - average debt in poland
        if (creditOffer.getRateOfInterest() * 28000 + creditOffer.getServiceCharge() > this.getRateOfInterest() * 28000 + this.getServiceCharge()) {
            return this;
        } else if (creditOffer.getRateOfInterest() * 28000 + creditOffer.getServiceCharge() == this.getRateOfInterest() * 28000 + this.getServiceCharge()) {
            return null;
        } else {
            return (CreditOffer) offer;
        }

    }

}
