package local.study.redis.service;

import local.study.redis.entity.MyPhone;

public interface RedisService
{
	public void test();
	
	public String get(String key);
	
	public void save(String key, String obj);
	
	public MyPhone getObject(String key);
	
	public void saveObject(String key, MyPhone object);
}
