package com.scb.hz.account.config;
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.config.MapConfig;
//import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@Configuration 
public class CacheConfig {
	
	@Bean
   public Config hazelCastConfig() {
	   Config acConfig=new Config();
	   acConfig.setInstanceName("hazelcast-instance");
	   
	    
	   MapConfig mpc = new MapConfig();
	   mpc.setName( "useraccount");
	  //mpc.s.setEvictionPolicy(EvictionPolicy.LRU);
	//  mpc.setMaxSizeConfig(MaxSizeConfig.DEFAULT_MAX_SIZE);
	   mpc.setTimeToLiveSeconds(2000);
	   //mpc.
	  
	   acConfig.addMapConfig(mpc);
	  // acConfig.setManagementCenterConfig(new ManagementCenterConfig().setEnabled(true).setUrl("http://localhost:8080/hazelcast-mancenter"));
	   return acConfig;
   }
	@Bean
	public HazelcastInstance hazelcastInstance(Config hazelCastConfig) {
		return Hazelcast.newHazelcastInstance(hazelCastConfig);
	} 
}
*/