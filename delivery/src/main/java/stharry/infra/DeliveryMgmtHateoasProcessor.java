package stharry.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import stharry.domain.*;

@Component
public class DeliveryMgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeliveryMgmt>> {

    @Override
    public EntityModel<DeliveryMgmt> process(EntityModel<DeliveryMgmt> model) {
        return model;
    }
}
