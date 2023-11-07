package stharry.domain;

import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productId;
    private Integer qty;
}
