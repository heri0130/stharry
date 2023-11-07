package stharry.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stharry.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveryMgmts",
    path = "deliveryMgmts"
)
public interface DeliveryMgmtRepository
    extends PagingAndSortingRepository<DeliveryMgmt, Long> {}
