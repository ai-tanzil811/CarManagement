package CarSystem;

public class carBuyerInformation {
    String name;
    int phoneNumber;
    String Address;
    int Nid;

    public carBuyerInformation(String name, int phoneNumber, String address, int nid) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        Address = address;
        Nid = nid;
    }
    void carBuyerDetails()
    {
        System.out.println("NAME : " +name);
        System.out.println("Contact Details");
        System.out.println(phoneNumber + " \n "+ Address) ;
        System.out.println("NID : "+Nid);
    }
}
