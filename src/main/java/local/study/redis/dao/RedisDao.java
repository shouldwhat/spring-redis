package local.study.redis.dao;

import local.study.redis.entity.MyPhone;

public interface RedisDao
{
	public String get(String key);
	
	public void save(String key, String value);
	
	public MyPhone getObject(String key);
	
	public void saveObject(String key, MyPhone object);
}
