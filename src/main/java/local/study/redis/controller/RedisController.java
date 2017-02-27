package local.study.redis.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import local.study.redis.entity.MyPhone;
import local.study.redis.service.RedisService;

@RestController
public class RedisController
{
	@Autowired
	private RedisService redisService;
	
	private final static Logger logger = LoggerFactory.getLogger(RedisController.class);
	
	@RequestMapping(value = "/key/{key}/json", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> getAsJson(HttpServletRequest request, @PathVariable String key)
	{
		logger.info("*** [ GET-JSON ] **************************************************************");
		logger.info("* key = {}", key);
		logger.info("******************************************************************************");
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("key", key);
		result.put("value", redisService.get(key));
		
		return result;
	}
	
	@RequestMapping(value = "key/{key}/string", method = RequestMethod.GET)
	public String getAsString(HttpServletRequest request, @PathVariable String key)
	{
		logger.info("*** [ GET-STRING ] ***********************************************************");
		logger.info("* key = {}", key);
		logger.info("******************************************************************************");
		
		return redisService.get(key);
	}
	
	@RequestMapping(value = "key/{key}/object", method = RequestMethod.GET)
	public MyPhone getAsObject(HttpServletRequest request, @PathVariable String key)
	{
		logger.info("*** [ GET-OBJECT ] ***********************************************************");
		logger.info("* key = {}", key);
		logger.info("******************************************************************************");
		
		return redisService.getObject(key);
	}
	
	@RequestMapping(value = "/key/{key}/value/{value}", method = RequestMethod.POST)
	public void put(HttpServletRequest request, @PathVariable String key, @PathVariable String value)
	{
		logger.info("*** [ PUT ] ******************************************************************");
		logger.info("* key = {}", key);
		logger.info("* value = {}", value);
		logger.info("******************************************************************************");
		
		redisService.save(key, value);
	}
	
	@RequestMapping(value = "/key/{key}/phone/{value}", method = RequestMethod.POST)
	public void putObject(HttpServletRequest request, @PathVariable String key, @PathVariable String value)
	{
		logger.info("*** [ PUT-OBJECT ] ************************************************************");
		logger.info("* key = {}", key);
		logger.info("* value = {}", value);
		logger.info("******************************************************************************");
		
		redisService.saveObject(key, new MyPhone(value));
	}
	
	
}
