package aspire.demo.jpa.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by andy.lv
 * on: 2018/12/13 12:04
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByFirstName(String firstName);
}
