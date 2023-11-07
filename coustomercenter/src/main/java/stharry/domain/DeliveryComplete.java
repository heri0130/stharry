package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stharry.infra.AbstractEvent;

@Data
public class DeliveryComplete extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
