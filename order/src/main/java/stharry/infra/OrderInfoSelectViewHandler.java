package stharry.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stharry.config.kafka.KafkaProcessor;
import stharry.domain.*;

@Service
public class OrderInfoSelectViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private OrderInfoSelectRepository orderInfoSelectRepository;
    //>>> DDD / CQRS
}
