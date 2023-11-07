package stharry.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stharry.OrderApplication;
import stharry.domain.OrderCancelled;
import stharry.domain.Ordered;

@Entity
@Table(name = "OrderMgmt_table")
@Data
//<<< DDD / Aggregate Root
public class OrderMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String productName;

    private Long productId;

    private Integer qty;

    private String status;

    private Date orderDt;

    private String address;

    @PostPersist
    public void onPostPersist() {
        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    public static OrderMgmtRepository repository() {
        OrderMgmtRepository orderMgmtRepository = OrderApplication.applicationContext.getBean(
            OrderMgmtRepository.class
        );
        return orderMgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryReturned deliveryReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReturned.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryCancelled deliveryCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancelled.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryComplete deliveryComplete) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryComplete.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notifyToWaitingCustomer(StockIncreased stockIncreased) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderMgmt orderMgmt = new OrderMgmt();
        repository().save(orderMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(stockIncreased.get???()).ifPresent(orderMgmt->{
            
            orderMgmt // do something
            repository().save(orderMgmt);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
