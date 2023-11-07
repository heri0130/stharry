package stharry.domain;

import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
}
