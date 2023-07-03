package org.ailen.core.Util;

import org.ailen.core.Entity.AirHosters;
import org.ailen.core.Entity.Captain;
import org.ailen.core.Entity.Filght;
import org.ailen.core.Entity.Product;
import org.ailen.core.Entity.Team;
import org.ailen.core.Entity.UserEntity;
import org.ailen.core.Entity.brand;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactoryUtil factoryUtil;
	
	public static SessionFactory  factory;
	
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			Configuration configuration=new  Configuration();
			configuration.setProperties(ConnectionPropertiesUtil.getMySqlDbProperties());
			configuration.addAnnotatedClass(UserEntity.class);
			configuration.addAnnotatedClass(Team.class);
			configuration.addAnnotatedClass(Captain.class);
			configuration.addAnnotatedClass(Filght.class);
			configuration.addAnnotatedClass(AirHosters.class);
			configuration.addAnnotatedClass(brand.class);
			configuration.addAnnotatedClass(Product.class);
			factory =configuration.buildSessionFactory();
		}
		return factory;
	}

}
