package hibernate.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hibernate.model.Post;
import hibernate.model.User;


@Repository("hibernateDAOImpl")
public class UserDaoImplementation implements UserDao {

	@Autowired
	private SessionFactory sessionfactory ;
	
	
	public int createUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUser(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUser(long id, User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int createPost(Post post) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Post getPostById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deletePostById(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Post> getAllPostByUserId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteAllPostByUserId(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
