package stharry.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stharry.domain.*;

@RepositoryRestResource(collectionResourceRel = "mypages", path = "mypages")
public interface MypageRepository
    extends PagingAndSortingRepository<Mypage, Long> {
    List<Mypage> findByOrderId(Long orderId);
}
