package aspire.demo.jpa;

import aspire.demo.jpa.user.User;
import aspire.demo.jpa.user.UserRepository;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by andy.lv
 * on: 2018/12/13 17:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() {
        User user = new User("leo", "lee");
        user.setAddressId(1L);
        System.out.println(userRepository.save(user));
    }

    @Test
    @Transactional
    public void findByFirstName() {
        List<User> users = userRepository.findByFirstName("leo");
        System.out.println(users);
    }

}
