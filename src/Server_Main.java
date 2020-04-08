import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_Main {

    public static void main(String[] args) throws IOException {

        int num,temp;
        ServerSocket serverSocket=new ServerSocket(1356);
        Socket socket=serverSocket.accept();

        Scanner scanner=new Scanner(socket.getInputStream());
        num=scanner.nextInt();

        temp=num*2;
        PrintStream printStream=new PrintStream(socket.getOutputStream());
        printStream.println(temp);

    }

}
