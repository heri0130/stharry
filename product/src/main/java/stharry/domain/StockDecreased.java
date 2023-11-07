package stharry.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;

    public StockDecreased(InventoryMgmt aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
