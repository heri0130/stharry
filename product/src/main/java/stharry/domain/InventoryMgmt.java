package stharry.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stharry.ProductApplication;
import stharry.domain.StockDecreased;
import stharry.domain.StockIncreased;

@Entity
@Table(name = "InventoryMgmt_table")
@Data
//<<< DDD / Aggregate Root
public class InventoryMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String productImg;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();
    }

    public static InventoryMgmtRepository repository() {
        InventoryMgmtRepository inventoryMgmtRepository = ProductApplication.applicationContext.getBean(
            InventoryMgmtRepository.class
        );
        return inventoryMgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(DeliveryComplete deliveryComplete) {
        //implement business logic here:

        /** Example 1:  new item 
        InventoryMgmt inventoryMgmt = new InventoryMgmt();
        repository().save(inventoryMgmt);

        StockDecreased stockDecreased = new StockDecreased(inventoryMgmt);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryComplete.get???()).ifPresent(inventoryMgmt->{
            
            inventoryMgmt // do something
            repository().save(inventoryMgmt);

            StockDecreased stockDecreased = new StockDecreased(inventoryMgmt);
            stockDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseStock(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        InventoryMgmt inventoryMgmt = new InventoryMgmt();
        repository().save(inventoryMgmt);

        StockDecreased stockDecreased = new StockDecreased(inventoryMgmt);
        stockDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(inventoryMgmt->{
            
            inventoryMgmt // do something
            repository().save(inventoryMgmt);

            StockDecreased stockDecreased = new StockDecreased(inventoryMgmt);
            stockDecreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStock(DeliveryReturned deliveryReturned) {
        //implement business logic here:

        /** Example 1:  new item 
        InventoryMgmt inventoryMgmt = new InventoryMgmt();
        repository().save(inventoryMgmt);

        StockIncreased stockIncreased = new StockIncreased(inventoryMgmt);
        stockIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReturned.get???()).ifPresent(inventoryMgmt->{
            
            inventoryMgmt // do something
            repository().save(inventoryMgmt);

            StockIncreased stockIncreased = new StockIncreased(inventoryMgmt);
            stockIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
