package ua.pp.darknsoft.accounts.service.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ua.pp.darknsoft.accounts.dto.CardsDto;

@Component
public class CardsFallback implements CardsFeignClient{

    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String mobileNumber) {
        return null;
    }
}
