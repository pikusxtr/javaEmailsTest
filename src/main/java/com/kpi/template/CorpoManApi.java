package com.kpi.template;

/**
 * Created by SG0213064 on 3/3/2015.
 */
public class CorpoManApi {
   private Address addressData;
    private int salary;
    private String firstName;
    private String lastName;
    private String title;
    private static int classCount = 0;


    public CorpoManApi() {
        classCount = classCount+ 1;

    }

    public CorpoManApi(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        classCount = classCount+ 1;
    }

    public CorpoManApi(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        classCount = classCount+ 1;
    }

   public CorpoManApi withFirstName(String firstName){
       this.firstName = firstName;
       return this;
   }
    public CorpoManApi withLastName(String lastName){
       this.lastName = lastName;
       return this;
   }
    public CorpoManApi withAddress(Address addressData){
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
