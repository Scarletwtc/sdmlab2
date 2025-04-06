package ex2lab2;

public class TCPMultipleClients {
    public static void main(String[] args){
        int nrOfClients = 10;
        for (int i = 0; i < nrOfClients; i++){
            TCPSingleClient client = new TCPSingleClient(i);
            client.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
