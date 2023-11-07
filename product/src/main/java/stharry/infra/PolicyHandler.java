package stharry.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stharry.config.kafka.KafkaProcessor;
import stharry.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryMgmtRepository inventoryMgmtRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryComplete'"
    )
    public void wheneverDeliveryComplete_DecreaseStock(
        @Payload DeliveryComplete deliveryComplete
    ) {
        DeliveryComplete event = deliveryComplete;
        System.out.println(
            "\n\n##### listener DecreaseStock : " + deliveryComplete + "\n\n"
        );

        // Sample Logic //
        InventoryMgmt.decreaseStock(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryReturned'"
    )
    public void wheneverDeliveryReturned_IncreaseStock(
        @Payload DeliveryReturned deliveryReturned
    ) {
        DeliveryReturned event = deliveryReturned;
        System.out.println(
            "\n\n##### listener IncreaseStock : " + deliveryReturned + "\n\n"
        );

        // Sample Logic //
        InventoryMgmt.increaseStock(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
