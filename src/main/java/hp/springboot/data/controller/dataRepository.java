package hp.springboot.data.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepository extends JpaRepository<data, Long>{

}
