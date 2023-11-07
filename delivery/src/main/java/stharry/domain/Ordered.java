package stharry.domain;

import java.util.*;
import lombok.*;
import stharry.domain.*;
import stharry.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private String producName;
    private Long producId;
    private Integer qty;
    private String status;
    private Date orderDt;
    private String address;
}
