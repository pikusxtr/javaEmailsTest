package com.kpi.template;

/**
 * Created by SG0213064 on 3/3/2015.
 */
public class CorpoMan {
    Address addressData;
    int salary;
    String firstName;
    String lastName;
    String title;
    static int classCount = 0;


    public CorpoMan() {
        classCount = classCount+ 1;

    }

    public CorpoMan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        classCount = classCount+ 1;
    }

    public CorpoMan(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        classCount = classCount+ 1;
    }

   public CorpoMan withFirstName(String firstName){
       this.firstName = firstName;
       return this;
   }
    public CorpoMan withLastName(String lastName){
       this.lastName = lastName;
       return this;
   }
    public CorpoMan withAddress(Address addressData){
       this.addressData = addressData;
       return this;
   }

    public void setAddressData(Address addressData) {
        this.addressData = addressData;
    }

    public int getClassCount() {
        return classCount;
    }
}
