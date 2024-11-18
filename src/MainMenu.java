import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    private byte choose;
    public void mainMenuStart(){
        while (true) {
            System.out.println("Welcome again!" + "\n" + "1.Create new client"+ "\n" + "2.Clients information" + "\n");
            choose = scanner.nextByte();
            if (choose == 1) {
                Client client = new Client();
                client.setNewClient();
            } else {break;}
        }
    }
}
