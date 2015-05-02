package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Deserializador {

	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Conta.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Conta conta = (Conta) unmarshaller.unmarshal(new File("conta.xml"));
			
			System.out.println("Limite: "+conta.getLimite());
			System.out.println("Saldo: "+conta.getSaldo());
			System.out.println("Cliente: "+conta.getCliente().getNome());
			
		} catch (JAXBException e) {
			System.out.println("Falha no sistema"+e.getMessage());
			e.printStackTrace();
		}

	}

}
