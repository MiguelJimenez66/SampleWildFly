package example.microservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="miServicio")
public class micro {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public int sumar(@WebParam(name="valor1") int a,@WebParam(name="valor2") int b) {
	    System.out.println("sumar: " + (a+b));
	    return (a+b);
	}
	
	@WebMethod()
	public String listar_placas_robadas() {
	    System.out.println("Placas: " + ("AAA000"));    
	    return "placa: AAA000 " +"ASD789 "+"DER457 " +"ABC123 " +"ASD563 "+"UER8442 "+"KFN379 "+"EKO975 "+"BMC036 "+"QAS389 "+"TCR476 "+"TRC890 "+"ADV645";
	}
}
