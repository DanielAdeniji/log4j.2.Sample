package log4j2;

import java.util.Map;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class hello 
{

	private static final Logger log 
				= LogManager.getLogger
					(
							//log4j2.hello.class
					);
	
	
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		String computerName = null;
		
		computerName = getComputerName();
		
		if (computerName != null)
		{
			
			computerName = getHostName();
						
		};
		
		//computerName = null;
		
		if (computerName != null)
		{
			log.info("Computer :- " + computerName);
		}
		else
		{
			
			log.error("Unknown Computer!");
			
		}
		
	}

	/*
	 * 
	 * https://stackoverflow.com/questions/7883542/getting-the-computer-name-in-java
	 */	
	static private String getHostName()
	{
	
		String hostname = null;
		
		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		
		return (hostname);
		
	}
	
	/*
	 * 
	 * https://stackoverflow.com/questions/7883542/getting-the-computer-name-in-java
	 */
	static private String getComputerName()
	{
	    Map<String, String> env = System.getenv();
	    if (env.containsKey("COMPUTERNAME"))
	        return env.get("COMPUTERNAME");
	    else if (env.containsKey("HOSTNAME"))
	        return env.get("HOSTNAME");
	    else
	        return null;
	}

}
