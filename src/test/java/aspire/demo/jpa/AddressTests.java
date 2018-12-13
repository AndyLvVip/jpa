package aspire.demo.jpa;

import aspire.demo.jpa.address.Address;
import aspire.demo.jpa.address.AddressRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by andy.lv
 * on: 2018/12/13 17:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressTests {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void save() {
        addressRepository.save(new Address("广东省", "佛山市", "禅城区"));
    }

    @Test
    public void findByProvince() {
        addressRepository.findByProvince("广东省");
    }
}
