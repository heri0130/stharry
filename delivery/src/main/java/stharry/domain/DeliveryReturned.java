package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productId;
    private Integer qty;

    public DeliveryReturned(DeliveryMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event
