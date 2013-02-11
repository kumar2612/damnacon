package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.damnacon.javaMavenSpringPgSMix.hs.data.dao.CustomerDao;
import com.damnacon.javaMavenSpringPgSMix.hs.data.model.Customer;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
        /*
    	System.out.println("\n\n==================== THE CUSTOMER CREATION ====================\n\n");
        Customer customer = new Customer("Mohamed Lamine", "Diakite", 23, "Second Essai", "Guinéenne", "mldiakite", "admin");
        customerDao.insert(customer);
        
        Customer customerToDelete = new Customer("Delete", "Diakite", 23, "Delete Essai", "Guinéenne", "ddiakite", "admin");
        customerDao.insert(customerToDelete);
        */
        System.out.println("\n\n==================== THE CUSTOMER SEARCH ====================\n\n");
        Customer customer1 = customerDao.findById(5);
        System.out.println(customer1);
 
        System.out.println("\n\n==================== THE CUSTOMER UPDATE ====================\n\n");
        customer1.setAge(18);
        customerDao.update(customer1);
        
        System.out.println("\n\n==================== THE CUSTOMER GET ALL ====================\n\n");
        List<Customer> customers = customerDao.findAll();
        for(int i=0; i<customers.size(); i++){
        	System.out.println("\nCustomer Number " + i);
        	System.out.println(customers.get(i));
        }
        
        System.out.println("\n\n==================== THE CUSTOMER DELETE ====================\n\n");
        //customerDao.delete(customerToDelete);
    }
}