package test;

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
        Customer customer = new Customer("Mamadi", "Diakite", 23, "First Essai", "Fran�aise", "mdiakite", "admin");
        customerDao.insert(customer);
 
        Customer customer1 = customerDao.findById(1);
        System.out.println(customer1);
 
    }
}