# spring-redis

-. Redis : 메모리상에 데이터를 Key-Value 형태로 저장하는 오픈소스 소프트웨어.

-. Spring과 Redis를 연동하기 위해, Spring-Data-Redis 라이브러리를 사용. 

-. Spring-Data-Redis 라이브러리는 pom.xml에 정의하여, maven을 통해 다운로드.

-. Key(String)-Value(String) 또는 Key(String)-Value(Object)의 형태의 데이터 핸들링 테스트.

-. Redis 연결에 필요한 ConnectionFactory와 Key,Value Serializer Bean은 root-context.xml에서 정의.

-. Class

	(1) RedisController.java : Redis에 데이터를 저장, 조회하는 테스트 용도의 Rest API를 게시.

	(2) RedisServiceImpl.java : Redis에 데이터를  저장하기전 비지니스 로직을 수행.

	(3) RedisDaoImpl.java : 실제 연산을 담당하는 Redis API를 호출.