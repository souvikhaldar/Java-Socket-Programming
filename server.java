import java.net.*;
import java.io.*;
public class server
{
  public static void main(String[] args) throws Exception
  {
    ServerSocket ss = new ServerSocket(7654);
    Socket s=ss.accept();
    BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
    String data= br.readLine();
    System.out.println("S: Data reciever from client:"+data);
  }
}
