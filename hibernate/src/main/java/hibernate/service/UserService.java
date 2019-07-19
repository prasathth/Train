package hibernate.service;

import java.util.List;

import hibernate.model.Post;
import hibernate.model.User;

public interface UserService {
	public int createUser(User user);
	public int deleteUser(long id);
	public int updateUser(long id, User user);
	
	
	public int createPost(Post post);
	public Post getPostById(long id);
	public int deletePostById(long id);
	public List<Post> getAllPostByUserId(long id);
	public int deleteAllPostByUserId(long id);
	
}
