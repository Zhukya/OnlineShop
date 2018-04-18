package MyProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import org.junit.experimental.categories.Categories;

import MyProject.entity.Category;
import MyProject.entity.Commodity;
import MyProject.entity.Customer;
import MyProject.entity.Orders;
import MyProject.entity.Producer;


public class App 
{
    public static void main( String[] args ) {
    	
    	EntityManagerFactory entityManagerFactory = 
    			Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = entityManagerFactory.createEntityManager();
    	
    	em.getTransaction().begin();
    	
//    	Customer customer = new Customer();
//    	customer.setAddress("Lviv");
//    	customer.setEmail("sdf@ssdg.com");
//    	customer.setName("Vova");
//    	customer.setPhone(0634445454);
//    	em.persist(customer);
    	
//    	Customer customer2 = new Customer();
//    	customer2.setAddress("Lviv");
//    	customer2.setEmail("sdssf@ssdg.com");
//    	customer2.setName("Vovan");
//    	customer2.setPhone(0634145454);
//    	em.persist(customer2);
//    	
//    	Orders orders = new Orders();
//    	orders.setCustomer(customer2);
//    	orders.setOrderPrice(null);
//    	orders.setProductPrice(null);
//    	orders.setQuantity(1);
//    	
//    	em.persist(orders);
    	
//    	Category category = new Category();
//    	category.setImage("im");
//    	category.setName("Electro");
//    	category.setQuantity(null);
//    	em.persist(category);
//    	
//    	Producer producer = new Producer();
//    	producer.setLogo("logo");
//    	producer.setName("LG");
//    	em.persist(producer);
//    	
//    	Producer producer2 = new Producer();
//    	producer2.setLogo("logo");
//    	producer2.setName("Samsung");
//    	em.persist(producer2);
//    	
//    	Commodity commodity = new Commodity();
//    	commodity.setCategory(category);
//    	commodity.setDescription("Very good product");
//    	commodity.setImage("im");
//    	commodity.setName("UE55VB");
//    	commodity.setPrice(15000);
//    	commodity.setProducer(producer);
//    	em.persist(commodity);
//    	
//
//    	Commodity commodity2 = new Commodity();
//    	commodity2.setCategory(category);
//    	commodity2.setDescription("Very bed product");
//    	commodity2.setImage("im1");
//    	commodity2.setName("UE35VB");
//    	commodity2.setPrice(5000);
//    	commodity2.setProducer(producer2);
//    	
//    	em.persist(commodity2);
    	
    	
    	
    	
//    	Customer cust = em.find(Customer.class, 1);
//    	System.out.println(cust.getName() +" "+ cust.getId());
    	
    	
    	Commodity com = em.find(Commodity.class, 10);
    	System.out.println(com);
    	
//    	Orders ord = em.find(Orders.class, 6);
//    	System.out.println(ord);
    	
    	
    	em.getTransaction().commit();
    	
    	
    	em.close();
    	entityManagerFactory.close();
    	
    }
}
