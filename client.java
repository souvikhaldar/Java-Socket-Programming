import java.net.*;
import java.io.*;
public class client
{
  public static void main(String[] args) throws Exception
  {
    String ip="localhost";
    int port= 7654;

    Socket s= new Socket(ip,port);
    OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
    os.write("souvik haldar");
    os.flush();
  }
}
