package name.lizhe.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

import redis.clients.jedis.JedisPoolConfig;

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
public class HttpSessionConfig {
	
	
	@Autowired
	private JedisPoolConfig jpc;
	
	@Bean
	public JedisPoolConfig getJedisPoolConfig() {
		return new redis.clients.jedis.JedisPoolConfig();
	}
	
	@Bean
	public JedisConnectionFactory getJedisConnectionFactory(){
		JedisConnectionFactory jcf = new org.springframework.data.redis.connection.jedis.JedisConnectionFactory();
		jcf.setHostName("172.28.128.4");
		jcf.setPort(6379);
		jcf.setPassword("lz12345");
		jcf.setUsePool(true);
		jcf.setPoolConfig(jpc);

		return jcf;
	}
	

}