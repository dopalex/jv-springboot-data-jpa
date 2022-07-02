package mate.academy.springboot.datajpa.dto.response;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ResponseProduct {
    private Long id;
    private String title;
    private BigDecimal price;
    private Long categoryId;
}
