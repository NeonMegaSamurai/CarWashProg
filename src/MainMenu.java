import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    private byte choose;
    public void mainMenuStart(){
        while (true) {
            int i = 0;
            Client [] nC = new Client[i+1];
            System.out.println("Welcome again!" + "\n" + "1.Create new client"+ "\n" + "2.Clients information");
            choose = scanner.nextByte();
            if (choose == 1) {
                Client client = new Client();
                client.setNewClient();
                nC[i] = client;
            } else if (choose == 2) {
                System.out.println("Choose client:");
                for (int a = 0; a<=nC.length; a++){
                    System.out.println(a + ". " + nC[a].name + nC[a].carModel);
                }
                int chooseClient = scanner.nextInt();
                for(int b = 0; b<=i; b++){
                    if(chooseClient == b){
                        nC[b].getClientInfo();
                    }
                }

                if(nC[0] == null){
                    System.out.println("You don't choose client!");
                    continue;
                }
            } else {System.out.println("Please enter correct choice!");}
            i = i++;
        }
    }
}
