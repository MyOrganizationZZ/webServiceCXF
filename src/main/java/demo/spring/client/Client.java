package demo.spring.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.service.HelloWorld;


public final class Client {

	
	
    private Client() {
    	System.out.println("Hello world 3");
    }

    public static void main(String args[]) throws Exception {
        // START SNIPPET: client
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});

        HelloWorld client = (HelloWorld)context.getBean("client");

        String response = client.sayHi("Joe");
        System.out.println("Response: " + response);
        System.exit(0);
//        // END SNIPPET: client
        
    }
}
