package local.study.redis.service;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.study.redis.dao.RedisDao;
import local.study.redis.entity.MyPhone;

@Service
public class RedisServiceImpl implements RedisService
{
	private final Logger logger = LoggerFactory.getLogger(RedisServiceImpl.class);
	
	@Autowired
	RedisDao redisDao;
	
	@Autowired
	Properties redisProperties;
	
	@Override
	public void test()
	{
		logger.info(redisProperties.toString());
	}
	
	@Override
	public String get(String key)
	{
		return redisDao.get(key);
	}

	@Override
	public MyPhone getObject(String key)
	{
		return redisDao.getObject(key);
	}
	
	@Override
	public void save(String key, String value)
	{
		redisDao.save(key, value);
	}

	@Override
	public void saveObject(String key, MyPhone object)
	{
		redisDao.saveObject(key, object);
	}
}
