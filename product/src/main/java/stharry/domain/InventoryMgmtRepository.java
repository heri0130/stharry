package stharry.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stharry.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inventoryMgmts",
    path = "inventoryMgmts"
)
public interface InventoryMgmtRepository
    extends PagingAndSortingRepository<InventoryMgmt, Long> {}
