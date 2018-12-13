package aspire.demo.jpa.address;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by andy.lv
 * on: 2018/12/13 16:57
 */
@Entity
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String province;

    @Column
    private String city;

    @Column
    private String area;

    public Address(String province, String city, String area) {
        this.province = province;
        this.city = city;
        this.area = area;
    }
}
