import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    Client [] nC = new Client[1];

    private byte choose;
    public void mainMenuStart(){
        while (true) {
            System.out.println("Welcome again!" + "\n" + "1.Create new client"+ "\n" + "2.Clients information");
            choose = scanner.nextByte();
            if (choose == 1) {
                Client client = new Client();
                client.setNewClient();
                nC[0] = client;
            } else if (choose == 2) {
                Client clientI = new Client();
                clientI = nC[0];
                clientI.getClientInfo();
            }
        }
    }
}
