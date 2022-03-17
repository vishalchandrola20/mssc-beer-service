package vishal.springframework.msscbeerservice.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import vishal.springframework.msscbeerservice.domian.Beer;
import vishal.springframework.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

/**
 * Created by vishal chandrola 01-03-2021
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);
}
