package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;

    public StockIncreased(InventoryMgmt aggregate) {
        super(aggregate);
    }

    public StockIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
