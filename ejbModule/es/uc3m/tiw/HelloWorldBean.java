package es.uc3m.tiw;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorldBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }

    
    public String retu2rnPhrase (String name){
    	return "Hello " +name+", from "+HelloWorldBean.class.getName();
    	}
}
