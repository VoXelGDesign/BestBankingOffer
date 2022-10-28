/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

import java.util.HashMap;

/**
 *
 * @author Student ETO-A 15
 */
public abstract class BankingOffer {
    private String bankName;
    private String offerName;     
    private String description; 
    private String offerType;
    private HashMap<String,Float> properties = new HashMap<String,Float>();
    
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }
       
    public String getDescription() {
        return description;
    }

    public void setDescription(String descritpion) {
        this.description = descritpion;
    }
    public void setOfferType(String offerType){
        this.offerType = offerType;
    }
    public String getOfferType(){
        return offerType;
    }
    
    public HashMap<String, Float> getProperties()
    {
        return properties;
    }
    public float getPropertyValue(String name)
    {
        return properties.get(name);
    }
    public void setProperty(String name, float value){
        this.properties.put(name, value);
    }
    
     public void compareOffers(){}
    
    
    
}
