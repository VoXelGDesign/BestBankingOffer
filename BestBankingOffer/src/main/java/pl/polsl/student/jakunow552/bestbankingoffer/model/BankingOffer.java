/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

import java.util.HashMap;

/**
 * Main class, all other classes used in model extends this class.<p>
 * {@link BankingOffer#bankName} - bank name that have this offer.<p>
 * {@link BankingOffer#offerName} - custom name of this offer<p>
 * {@link BankingOffer#description} - descripton of the offer<p>
 * {@link BankingOffer#offerType} - type of offer (set only by the method
 * setOfferType used in subclass constructor)
 * <p>
 * {@link BankingOffer#properties} - hash map with property {@link String} name
 * as a key and {@link float} value.<p>
 * @version 1.0-FINAL
 * @author Jakub Nowakowski
 */
public abstract class BankingOffer {

    public enum OfferType {
        CREDIT,
        PERSONAL,
        SAVINGS
    }
    //Name of the bank that offer is provided by
    private String bankName;
    //Specyfic name of the offer
    private String offerName;
    //Short desciption of the offer
    private String description;
    // Type of offer represented by string
    private OfferType offerType;
    //Hash map of all properties, name of property is key and represented by string
    // value of the key (name of property) is represented by float
    private HashMap<String, Float> properties = new HashMap<String, Float>();

    /**
     * Sets offer type provied by method argument. used only in subcalss
     * constructor.
     *
     * @param offerType {@link String} type of offer.
     */
    protected void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }

    /**
     * Method returns name of the bank.
     *
     * @return {@link String} bank name.
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Method sets bank name as a String.
     *
     * @param bankName {@link String} bank name.
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Method returns offer name as String.
     *
     * @return {@link String} offer name.
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Method sets offer name as a String.
     *
     * @param offerName {@link String} offer name.
     */
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * Method returns descrition of the offer.
     *
     * @return {@link String} offer description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method sets description of the offer.
     *
     * @param descritpion {@link String} offer description
     */
    public void setDescription(String descritpion) {
        this.description = descritpion;
    }

    /**
     * Method returns offer type.
     *
     * @return {@link String} offer type.
     */
    public OfferType getOfferType() {
        return offerType;
    }

    /**
     * Method returns hash map of offer properties
     *
     * @return hash map of {@link BankingOffer#properties} where key is
     * {@link String} and value is {@link float}.
     */
    public HashMap<String, Float> getProperties() {
        return properties;
    }

    /**
     * Method returns value of provided property
     * {@link BankingOffer#properties}.
     *
     * @param name {@link String} name of property value to return.
     * @return {@link float} value of provided property.
     */
    public float getPropertyValue(String name) {
        return properties.get(name);
    }

    /**
     * Method add new property or modify existing one.
     *
     * @param name {@link String} name of property.
     * @param value {@link float} value of property.
     * @throws {@link NegativePropertyException} is thrown when value of
     * property is less than zero<p>
     * If there is existing name of property same as provieded value will be
     * updated.
     */
    public void setProperty(String name, float value) throws NegativePropertyException {
        if (value < 0) {
            throw new NegativePropertyException(this.bankName);
        } else {
            this.properties.put(name, value);
        }

    }

    /**
     * This method is overridden by subclasses methods. Each class applies own
     * logic to compare properties.
     */
    public BankingOffer compareOffers(BankingOffer offer) {
        return null;
    }

    /**
     * This method comapres offer obejct types and throws exception when they do
     * not mach.
     *
     * @param a first offer object to compare {@link BankingOffer}.
     * @param b second offer offer object to compare{@link BankingOffer}.
     * @throws TypeException exepction thrown when type of comapring objects is
     * different.
     */
    public void checkTypeCoherence(BankingOffer a, BankingOffer b) throws TypeException {
        if (a.getOfferType() != b.getOfferType()) {
            throw new TypeException();
        }

    }

}
