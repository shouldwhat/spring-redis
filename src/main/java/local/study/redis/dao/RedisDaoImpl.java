package local.study.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import local.study.redis.entity.MyPhone;

@Repository
public class RedisDaoImpl implements RedisDao
{
	private static final String KEY = "WKKIM";
	
	@Autowired
	RedisTemplate<String, String> defaultRedisTemplate;
	
	@Autowired
	RedisTemplate<String, MyPhone> objectRedisTemplate;
	
	@Override
	public String get(String key)
	{
		//return this.redisTemplate.opsForHash().get(KEY, key).toString();
		return this.defaultRedisTemplate.opsForValue().get(key);
	}

	@Override
	public MyPhone getObject(String key)
	{
		return objectRedisTemplate.opsForValue().get(key);
	}
	
	@Override
	public void save(String key, String value)
	{
		//this.redisTemplate.opsForHash().put(KEY, key, value);
		this.defaultRedisTemplate.opsForValue().set(key, value);
	}

	@Override
	public void saveObject(String key, MyPhone object)
	{
		this.objectRedisTemplate.opsForValue().set(key, object);
	}
}
