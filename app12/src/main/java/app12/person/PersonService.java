package app12.person;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import app12.listener.MyWebContextListener;

public class PersonService {
	public List<Person> getAll() {
		try (SqlSession sqlSession = MyWebContextListener.getSqlSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			
			return personMapper.getAll();
		}
	}

	public int insert(Person p) {
		try (SqlSession sqlSession = MyWebContextListener.getSqlSession()) {
			PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
			
			int result = personMapper.insert(p);
			
			sqlSession.commit();
			return result;
		}
	}
}
