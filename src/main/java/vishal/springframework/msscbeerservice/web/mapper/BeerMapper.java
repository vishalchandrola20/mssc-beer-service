package vishal.springframework.msscbeerservice.web.mapper;

import vishal.springframework.msscbeerservice.domian.Beer;
import vishal.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}