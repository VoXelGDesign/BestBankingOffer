/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 *
 * @author Student ETO-A 15
 */
public class BankingOffer {
    private String bankName;
    private String offerName;  
    private Type offerType;
    private String description; 
    protected enum Type{
        CREDIT,
        SAVINGS,
        PERSONAL
    }
    
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
    
     public String getOfferTypeString() {
        return offerType.toString();
    }
     public Type getOfferTypeEnum() {
        return offerType;
    }

    public void setOfferType(Type offerType) {
        this.offerType = offerType;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String descritpion) {
        this.description = descritpion;
    }
    
    
    
    
}
