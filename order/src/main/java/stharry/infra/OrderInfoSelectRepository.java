package stharry.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stharry.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderInfoSelects",
    path = "orderInfoSelects"
)
public interface OrderInfoSelectRepository
    extends PagingAndSortingRepository<OrderInfoSelect, Long> {}
