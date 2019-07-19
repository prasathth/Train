package hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hibernate.dao.UserDao;
import hibernate.model.Post;
import hibernate.model.User;

@Service(value="userService")
public class UserServiceImplementation implements UserService {

	@Autowired
    @Qualifier(value = "hibernateDAOImpl")
	private UserDao userdao; 
	
	public UserServiceImplementation(@Qualifier(value = "hibernateDAOImpl") UserDao userdao) {
		super();
		this.userdao = userdao;
	}
	
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
