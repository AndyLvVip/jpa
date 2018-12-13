package aspire.demo.jpa.address;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by andy.lv
 * on: 2018/12/13 17:41
 */
public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findByProvince(String province);
}
