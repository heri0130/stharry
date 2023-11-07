package stharry.domain;

import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
