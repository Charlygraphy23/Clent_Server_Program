import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_Main {

    public static void main(String[] args) throws IOException {

        int number,temp;

        Socket socket=new Socket("192.168.43.166",1356);
        Scanner scanner=new Scanner(socket.getInputStream());

        Scanner inputFromUser=new Scanner(System.in);
        number=inputFromUser.nextInt();

        PrintStream stream=new PrintStream(socket.getOutputStream());
        stream.println(number);

        temp=scanner.nextInt();
        System.out.println(temp);


    }
}
