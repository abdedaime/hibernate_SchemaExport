package com.app.bean;

import static org.junit.Assert.*;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/***
 * 
 * @author hicham-pc
 *
 */
public class Test {

	@org.junit.Test
	public void test() {
		  Configuration   cfg=new Configuration().configure();
		  cfg.setNamingStrategy(new  ImprovedNamingStrategy());
		 SchemaExport  export=new SchemaExport(cfg);
		 export.setOutputFile("src/com/app/bean/bdd.sql");
		 export.create(true, false);
	}

}
