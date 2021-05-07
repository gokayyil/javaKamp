package class4Work;

import java.rmi.RemoteException;
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapter.MerniceServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.save(new Customer(1,"Gökay","Yýldýrým",LocalDate.of(2000, 8, 9),"31576510578"));
		System.out.println();
	}

}
;