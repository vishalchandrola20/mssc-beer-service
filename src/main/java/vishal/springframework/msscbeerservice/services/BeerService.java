package vishal.springframework.msscbeerservice.services;

import org.springframework.data.domain.PageRequest;
import vishal.springframework.msscbeerservice.web.model.BeerDto;
import vishal.springframework.msscbeerservice.web.model.BeerPagedList;
import vishal.springframework.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
