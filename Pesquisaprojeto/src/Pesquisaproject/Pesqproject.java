package Pesquisaproject;
import java.io.*;
import java.util.*;
import java.net. *;  
import java.net.URL;

public class Pesqproject {

	public static void main(String[] args) {
		 try {
		      // Obtem o endereco da maquina local, associando ao
		      // objeto "myself".  Observe que esse objeto nao e' 
		      // criado por um construtor, mas sim retornado por
		      // um metodo estatico da classe.
		      InetAddress host1 = InetAddress.getLocalHost();
		      InetAddress host2 =InetAddress.getByName("DESKTOP-3DS0N");
		    //  byte[] addr = {10,0,2,15};
		     
		     // InetAddress otherHost = InetAddress.getByAddress(addr);
		   //   System.out.println(InetAddress.getByAddress(addr).getHostName());
		      // Uma vez que um objeto InetAddress esteja disponivel,
		      // os metodos getHostName() e  getHostAddress() podem
		      // ser aplicados ao objeto para obter a representacao 
		      // simbolica e numerica do endereco IP, respectivamente
		      InetAddress address = InetAddress.getByName("216.58.202.228"); 
		      System.out.println(address.getHostAddress());
		      System.out.println(address.getHostName());
		      InetAddress addres = InetAddress.getByName("192.168.10.103"); 
		      System.out.println(addres.getHostAddress());
		      System.out.println(addres.getHostName());
		      InetAddress and = InetAddress.getByName("www.google.com"); 
		      System.out.println(and.getHostAddress());
		      System.out.println(and.getHostName());
		       
		      
		      NetworkInterface netInter = NetworkInterface.getByInetAddress( host1 );
		      System.out.println("hh"+netInter.getDisplayName());
		      byte[] macAddressBytes = netInter.getHardwareAddress();
		      
		      String macAddress =  String.format ( "%1$02x-%2$02x-%3$02x-%4$02x-%5$02x-%6$02x",
		      macAddressBytes[0], macAddressBytes[1],
		      macAddressBytes[2], macAddressBytes[3],
		      macAddressBytes[4], macAddressBytes[5] ).toUpperCase();
		   
		      System.out.println("mac "+macAddress	);		      
		   
		     // System.out.println("00  "+InetAddress.getByAddress(addr));
		      System.out.println("Host Local1 " + host1.getHostName());
		      System.out.println(" ip do Host1 " + host1.getHostAddress());
		     
		      System.out.println(" ip2  " + host2.getHostName());
		      System.out.println("teste2 "+host2.getCanonicalHostName()+"///"+host2);
		    }catch (Exception end){System.out.println(""+end.getMessage());}
		    
		 	
		 int count = 0;
		    InetAddress otherHost;
		    while (count < 10) {
		      // Metodo estatico getByName() retorna um objeto InetAddress
		      // associado ao endereco da maquina cujo nome (formato simbolico 
		      // ou numerico) foi especificado como argumento.  Pode gerar uma
		      // excecao caso o nao seja possivel determinar esse endereco.
		      try{
			otherHost = InetAddress.getByName(args[count]);
			System.out.println("Host " + otherHost.getHostName() + 
					   " is at IP address " + otherHost.getHostAddress());
		     
		    }catch (Exception end){System.out.println(""+end.getMessage());}
		      count++;
		     
		    }
		    try{
		   URL url = new URL("https://www.google.com.br/");
		
		    URLConnection c = url.openConnection();  // Get URLConnection from the URL
		    c.connect();                             // Open a connection to the URL
		    
		    // Display some information about the URL contents
		    System.out.println("  Content Type: " + c.getContentType());
		    System.out.println("  Content Encoding: " + c.getContentEncoding());
		    System.out.println("  Content Length: " + c.getContentLength());
		    System.out.println("  Date: " + new Date(c.getDate()));
		    System.out.println("  Last Modified: " + new Date(c.getLastModified()));
		    System.out.println("  Expiration: " + new Date(c.getExpiration()));

		    // If it is an HTTP connection, display some additional information.
		    if (c instanceof HttpURLConnection) {
		      HttpURLConnection h = (HttpURLConnection) c;
		      System.out.println("  Request Method: " + h.getRequestMethod());
		      System.out.println("  Response Message: " + h.getResponseMessage());
		      System.out.println("  Response Code: " + h.getResponseCode());
		    }
		    }catch (Exception end){System.out.println(""+end.getMessage());}
		    
		  
		  /** Create a URL object, call printinfo() to display information about it. */
		
		
	}
}


