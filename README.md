# spring-redis

-. Redis : �޸𸮻� �����͸� Key-Value ���·� �����ϴ� ���¼ҽ� ����Ʈ����.

-. Spring�� Redis�� �����ϱ� ����, Spring-Data-Redis ���̺귯���� ���. 

-. Spring-Data-Redis ���̺귯���� pom.xml�� �����Ͽ�, maven�� ���� �ٿ�ε�.

-. Key(String)-Value(String) �Ǵ� Key(String)-Value(Object)�� ������ ������ �ڵ鸵 �׽�Ʈ.

-. Redis ���ῡ �ʿ��� ConnectionFactory�� Key,Value Serializer Bean�� root-context.xml���� ����.

-. Class

	(1) RedisController.java : Redis�� �����͸� ����, ��ȸ�ϴ� �׽�Ʈ �뵵�� Rest API�� �Խ�.

	(2) RedisServiceImpl.java : Redis�� �����͸�  �����ϱ��� �����Ͻ� ������ ����.

	(3) RedisDaoImpl.java : ���� ������ ����ϴ� Redis API�� ȣ��.