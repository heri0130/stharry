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
public class MypageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MypageRepository mypageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrdered_then_CREATE_1(@Payload Ordered ordered) {
        try {
            if (!ordered.validate()) return;

            // view 객체 생성
            Mypage mypage = new Mypage();
            // view 객체에 이벤트의 Value 를 set 함
            mypage.setUserId(Long.valueOf(ordered.getUserId()));
            mypage.setOrderId(ordered.getId());
            mypage.setProductName(ordered.getProductName());
            mypage.setQty(ordered.getQty());
            mypage.setOrderDt(ordered.getOrderDt());
            mypage.setOrderStatus(ordered.getStatus());
            // view 레파지 토리에 save
            mypageRepository.save(mypage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryStarted_then_UPDATE_1(
        @Payload DeliveryStarted deliveryStarted
    ) {
        try {
            if (!deliveryStarted.validate()) return;
            // view 객체 조회

            List<Mypage> mypageList = mypageRepository.findByOrderId(
                deliveryStarted.getOrderId()
            );
            for (Mypage mypage : mypageList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                mypage.setDeliveryStatus(deliveryStarted.getStatus());
                mypage.setDeliveryDt(deliveryStarted.getDeliveryDt());
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryComplete_then_UPDATE_2(
        @Payload DeliveryComplete deliveryComplete
    ) {
        try {
            if (!deliveryComplete.validate()) return;
            // view 객체 조회

            List<Mypage> mypageList = mypageRepository.findByOrderId(
                deliveryComplete.getOrderId()
            );
            for (Mypage mypage : mypageList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                mypage.setDeliveryStatus(deliveryComplete.getStatus());
                mypage.setDeliveryDt(deliveryComplete.getDeliveryDt());
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
