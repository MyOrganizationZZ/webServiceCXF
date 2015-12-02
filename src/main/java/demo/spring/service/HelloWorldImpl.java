package demo.spring.service;
 
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
 
@WebService(endpointInterface = "demo.spring.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
 
	@WebMethod(operationName="decirHola") 
    public String sayHi(String text) {
        System.out.println("sayHi called angel");
        return "Hello " + text;
    }
}
