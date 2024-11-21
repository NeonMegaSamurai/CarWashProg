import java.util.Locale;
import java.util.Scanner;

public class Client {

    Scanner scanner = new Scanner(System.in);
    String name;
    String phoneNumber;
    String carModel;
    String licensePlates;

    public void setNewClient(){
        setName();
        setPhoneNumber();
        setCarModel();
        setLicensePlates();
    }
    private void setName(){
        System.out.print("Enter Client Name: ");
        boolean answer = true;
        name = scanner.nextLine();
    }
    private void setPhoneNumber(){
        System.out.print("Enter Client Phone Number: ");
        phoneNumber = scanner.nextLine();
    }
    private void setCarModel(){
        System.out.print("Enter Client Car Model: ");
        carModel = scanner.nextLine();
    }
    private void setLicensePlates(){
        System.out.print("Enter Client Car License Plates: ");
        licensePlates = scanner.nextLine();
    }
    public void getClientInfo(){
        getName(name);
        getPhoneNumber(phoneNumber);
        getCarModel(carModel);
        getLicensePlates(licensePlates);
    }
    private void getName(String name){
        this.name = name;
        System.out.println("Client name: "+name);
    }
    private void getPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        System.out.println("Client Phone Number: " + phoneNumber);
    }
    private void getCarModel(String carModel){
        this.carModel = carModel;
        System.out.println("Client Car Model: " + carModel);
    }
    private void getLicensePlates(String licensePlates){
        this.licensePlates = licensePlates;
        System.out.println("Client License Plates: " + licensePlates);
    }
}
