/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingofferweb.model;

/**
 * Subcalss - represent personal account offer of the bank (specifies type of
 * the offer by using {@link CreditOffer#setOfferType} in the constructor)
 * .<p>
 * Extends class: {@link BankingOffer}
 * .<p>
 * Methods added coresponds to specific prameters assigned to the personal
 * account offer.
 *
 * @version 3.0-FINAL
 * @author Jakub Nowakowski
 */
public class PersonalAccountOffer extends BankingOffer {

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - PERSONAL.
     *
     * @param bankName bank name that have this offer.
     * @param interest specific property for this class.
     * @param monthlyFee specific property for this class.
     */
    public PersonalAccountOffer(String bankName, float interest, float monthlyFee) {
        this.setOfferType(OfferType.PERSONAL);
        this.setBankName(bankName);
        this.setOfferName("No name");
        this.setProperty("Interest", interest);
        this.setProperty("Monthly Fee", monthlyFee);
    }

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - PERSONAL.
     *
     * @param bankName bank name that have this offer.
     * @param offerName name associated with this offer.
     * @param interest specific property for this class.
     * @param monthlyFee specific property for this class.
     */
    public PersonalAccountOffer(String bankName, String offerName, float interest, float monthlyFee) {
        this.setOfferType(OfferType.PERSONAL);
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Interest", interest);
        this.setProperty("Monthly Fee", monthlyFee);
    }

    /**
     * Constructor initializes all parameters below and set offer type to
     * {@link OfferType} - PERSONAL.
     *
     * @param bankName bank name that have this offer.
     * @param offerName name associated with this offer.
     * @param interest specific property for this class.
     * @param monthlyFee specific property for this class.
     * @param description offer descripton.
     */
    public PersonalAccountOffer(String bankName, String offerName, float interest, float monthlyFee, String description) {
        this.setOfferType(OfferType.PERSONAL);
        this.setBankName(bankName);
        this.setOfferName(offerName);
        this.setProperty("Interest", interest);
        this.setProperty("Monthly Fee", monthlyFee);
        this.setDescription(description);
    }

    /**
     * This method gets interest property value tied to
     * {@link PersonalAccountOffer}.
     *
     * @return {@link float} value of interest.
     */
    public float getInterest() {
        return this.getPropertyValue("Interest");
    }

    /**
     * This method sets interest property value tied to
     * {@link PersonalAccountOffer}.
     *
     * @param interest {@link float} value of interest
     */
    public void setInterest(float interest) {
        this.setProperty("Interest", interest);
    }

    /**
     * This method gets monthly fee property value tied to
     * {@link PersonalAccountOffer}.
     *
     * @return {@link float} value of monthly fee.
     */
    public float getMonthlyFee() {
        return this.getPropertyValue("Monthly Fee");
    }

    /**
     * This method sets monthly fee property value tied to
     * {@link PersonalAccountOffer}.
     *
     * @param monthlyFee {@link float} value of monthly fee.
     */
    public void setMonthlyFee(float monthlyFee) {
        this.setProperty("Monthly Fee", monthlyFee);
    }

    /**
     * This method compares credit offers and exepction is thrown when offer
     * types do not mach.<p>
     * Exception deatils: {@link TypeException}
     *
     * @param offer offer object to comapre.
     * @return better {@link PersonalAccountOffer} or if offers are the same -
     * null .
     */
    @Override
    public BankingOffer compareOffers(BankingOffer offer) {
        checkTypeCoherence(this, offer);
        PersonalAccountOffer personalAccOffer = (PersonalAccountOffer) offer;
        // 6480 - average monthly salary in poland
        if (personalAccOffer.getInterest() * 6480 + personalAccOffer.getMonthlyFee() < this.getInterest() * 6480 + this.getMonthlyFee()) {
            return this;
        } else if (personalAccOffer.getInterest() * 6480 + personalAccOffer.getMonthlyFee() == this.getInterest() * 6480 + this.getMonthlyFee()) {
            return null;
        } else {
            return (PersonalAccountOffer) offer;
        }

    }
}
