package womenandchilddepartment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import womenandchilddepartment.model.Advertisement;
import womenandchilddepartment.model.Post;
//@Repository
public interface AdvertisementRepo extends JpaRepository<Advertisement, Integer>{

	Advertisement findByAdvertisementNo(Integer advertisementNo);
	boolean existsByAdvertisementNo(Integer advertisementNo);
}
