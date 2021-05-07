package adapter;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
			KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
			
			boolean result = false;
			try {
				result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
			} catch (NumberFormatException e) {
				e.printStackTrace();
				
			} catch(RemoteException e) {
				e.printStackTrace();
				
			}
			return result;
	}

}
