package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryComplete extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;

    public DeliveryComplete(DeliveryMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryComplete() {
        super();
    }
}
//>>> DDD / Domain Event
