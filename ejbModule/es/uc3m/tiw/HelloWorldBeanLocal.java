package es.uc3m.tiw;

import javax.ejb.Local;

@Local
public interface HelloWorldBeanLocal {
	
	public String retu2rnPhrase (String name);

}
