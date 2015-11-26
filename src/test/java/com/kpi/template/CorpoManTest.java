package com.kpi.template;


/**
 * Created by SG0213064 on 3/3/2015.
 */
public class CorpoManTest {
    public static void main(String[] args) {
        System.out.println("Test AAAAAAA");
        showCorpoCount();
        Address testAddress001 = new Address("wisniowa", "21", "Kety", "32-650");
        Address testAddress002 = new Address("wisniowaB", "44", "Tychy", "43-100");
        CorpoMan KrisCorpo01 = new CorpoMan("Kris", "Pikus");
        showCorpoCount();
        CorpoMan KrisCorpoTit01 = new CorpoMan("Kris", "PikusBBB", "Mr");
        showCorpoCount();
        System.out.println("===================================");
        System.out.println("instance 01 name = " + KrisCorpo01.lastName);
        System.out.println("instance 02 name = " + KrisCorpoTit01.lastName);
        KrisCorpo01.setAddressData(testAddress001);
        System.out.println("addres instance 01 getCity=" + KrisCorpo01.addressData.getCity());
        System.out.println("addres instance 01 getStreetName=" + KrisCorpo01.addressData.getStreetName());
        System.out.println("addres instance 01 getZipCode=" + KrisCorpo01.addressData.getZipCode());
        //KorpoMan with DSL
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++DSL TEST ++++++++++++++++++++++++");
        CorpoMan KrisCorpo003 = new CorpoMan().withFirstName("Kris").withLastName("Piekos").withAddress(testAddress001);
        showCorpoReport(KrisCorpo003);
        showCorpoCount();
        hashPlay(KrisCorpo003);
        Address testAddress003 = new Address("wisniowaCCC", "555", "Tychyyyy", "44-400");
        CorpoShellMan ShellKris01 = (CorpoShellMan) new CorpoShellMan().withFirstName("KrisSh").withLastName("PiekosSH").withAddress(testAddress003);
        CorpoMan Kris01CorpoProp =  new CorpoShellMan().withFirstName("KrisSh").withLastName("PiekosSH").withAddress(testAddress003);

        System.out.println("fuel amount after Shell instance creation=" + ShellKris01.getFuelAmount());
        ShellKris01.increaseFuelAmount(300);
        System.out.println("fuel amount after fuel increase=" + ShellKris01.getFuelAmount());
        if(ShellKris01 instanceof CorpoMan){
            System.out.println("SHEll KRIS  instance of CorpoMan !!!!!!!!!!!!!!!!!!!!");
        }

        if(ShellKris01 instanceof CorpoShellMan){
            System.out.println("SHEll KRIS  instance of CorpoShellMan !!!!!!!!!!!!!!!!!!!!");
        }
        if(ShellKris01 instanceof Object){
            System.out.println("SHEll KRIS  instance of Object !!!!!!!!!!!!!!!!!!!!");
        }
        if(KrisCorpo003 instanceof CorpoShellMan){
            System.out.println("KrisCorpo003  instance of CorpoShellMan !!!!!!!!!!!!!!!!!!!!");
        }else {
            System.out.println("KrisCorpo003  NOT instance of CorpoShellMan !!!!!!!!!!!!!!!!!!!!");

        }




        showCorpoCount();


    }

    private static void showCorpoCount() {
        System.out.println("corpoManCount=" + CorpoMan.classCount);
    }

    private static void showCorpoReport(CorpoMan corpoMan){
        System.out.println("Corpo Address city = "+ corpoMan.addressData.getCity());
        System.out.println("Corpo Address zipcode= "+ corpoMan.addressData.getZipCode());
        System.out.println("Corpo Address street= "+ corpoMan.addressData.getStreetName());
        System.out.println("Corpo Address streetNo= "+ corpoMan.addressData.getStreetNo());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("corpoMan name is " + corpoMan.firstName + " " + corpoMan.lastName);
    }

    private static void hashPlay(CorpoMan corpoMan){
        System.out.println("hashCode of corpoInstance=" + corpoMan.hashCode() +"+++++ "+  corpoMan.getClass().getName());
        if(corpoMan instanceof CorpoMan){
            System.out.println("MAn instance of CorpoMan !!!!!!!!!!!!!!!!!!!!");
        }
    }

}
