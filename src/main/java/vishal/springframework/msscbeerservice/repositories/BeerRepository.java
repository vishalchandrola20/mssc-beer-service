package vishal.springframework.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import vishal.springframework.msscbeerservice.domian.Beer;

import java.util.UUID;

/**
 * Created by vishal chandrola 01-03-2021
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
