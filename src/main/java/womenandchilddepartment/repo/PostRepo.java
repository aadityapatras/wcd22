package womenandchilddepartment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import womenandchilddepartment.model.Post;
//@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{

	
}
