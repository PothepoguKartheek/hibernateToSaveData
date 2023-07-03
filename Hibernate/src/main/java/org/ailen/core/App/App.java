package 
org.ailen.core.App;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.ailen.core.Entity.AirHosters;
import org.ailen.core.Entity.Captain;
import org.ailen.core.Entity.Filght;
import org.ailen.core.Entity.Product;
import org.ailen.core.Entity.Team;
import org.ailen.core.Entity.UserEntity;
import org.ailen.core.Entity.brand;
import org.ailen.core.Repository.UserRepository;
import org.hibernate.metamodel.model.domain.spi.IdentifiableTypeDescriptor.InFlightAccess;

public class App {
	
	public static void main(String[] args) {
		
//		UserEntity entity=new UserEntity();
////		entity.setAltKey(124L);
//		entity.setName("abd");
//		entity.setEmail("abc@gmail.com");
//		entity.setPassword("123");
//		entity.setCity("Texes");
//		entity.setCountry("India");
//		entity.setPinCode("3306");
//		entity.setContactNumber("12434");
		
		UserRepository repository=new UserRepository();
//		repository.save(entity);
//		UserEntity findById = repository.findById(124L);
//		System.out.println(findById);
//		repository.delete(123L);
//		List<UserEntity> findall = repository.findall();

//		for(int i=0;i<findall.size();i++)
//		{
//			
//			UserEntity user= findall.get(i);
////			if(user.getName().equalsIgnoreCase("abd"))
////			{
//				System.out.println(user);
//				System.out.println();
////			}
//		}
//		findall.forEach(each->
//		{
//			System.out.println(each);
//		});
//		List<UserEntity> userEntities=findall.stream().filter(each-> each.getName().equalsIgnoreCase("abd")).collect(Collectors.toList());
//		System.out.println(userEntities);
//		Long count=findall.stream().count();
//		System.out.println(count);
//		List<UserEntity> findByName = repository.findByName("abd");
//		findByName.forEach(each->
//		{
//			System.out.println(each);
//		});
//		
//		repository.UpdateByemail("12345","abc@gmail.com");
//		repository.DeleteUserByEmail("abc@gmail.com");
		
//		Team team= new Team();
//		team.setName("India cricket");	
//		team.setTeamSize("11");
//		team.setTeamType("cricket");
//		
//		Captain captain=new Captain();
//		captain.setAge("34");
//		captain.setCaptainName("virat");
//		captain.setEmail("king@gmail.com");
//		
//		team.setCaptain(captain);
//		repository.saveTeamDetail(team);
//		Filght filght =new Filght();
//		filght.setFlightname("Qutar");
//		filght.setFlightNumber("1234");
//		filght.setPrice("5000");
//		
//		List<AirHosters> list= new ArrayList<>();
//	    AirHosters airHosters2=new AirHosters();
//	    airHosters2.setName("abc");
//	    airHosters2.setAge("28");
//	    AirHosters airHosters3=new AirHosters();
//	    airHosters3.setName("bbc");
//	    airHosters3.setAge("28");
//	    list.add(airHosters2);
//	    list.add(airHosters3);
//	    filght.setAirHosters(list);
//	    repository.saveFlightDetails(filght);
		List<Product> productsList=new ArrayList<>();
		
		Product p1=new Product();
		p1.setProductName("Chocolate");
		Product p2=new Product();
		p2.setProductName("venila");
		productsList.add(p1);
		productsList.add(p2);
	
		
		brand b1=new brand();
		b1.setBrandName("eclese");
		b1.setProducts(productsList);
		brand b2=new brand();
		b2.setBrandName("alpenlibe");
		b2.setProducts(productsList);
		
		
		List<brand> brands=new ArrayList<>();
		brands.add(b1);
		brands.add(b2);
		p1.setBrand(brands);
		p2.setBrand(brands);
		
		repository.saveProductDetails(p2);
		
		
	    
	    
	    
	    
		

		
		
		
		
		
		
		
		
	}

}
            