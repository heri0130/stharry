package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private Date orderDt;

    public OrderCancelled(OrderMgmt aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
