package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	private Logger log = LoggerFactory.getLogger(CarService.class);
	
	public void process(String msg)
	{
		
		if(log.isDebugEnabled())
			log.debug("Processing......"+msg);
		log.debug("Processing......"+msg);
		log.info("Processing......"+msg);
		log.error("Processing......"+msg);
		//System.out.println("car process");
	}
}
