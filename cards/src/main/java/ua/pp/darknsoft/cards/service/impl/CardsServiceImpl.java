package ua.pp.darknsoft.cards.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.pp.darknsoft.cards.dto.CardDto;
import ua.pp.darknsoft.cards.entity.Card;
import ua.pp.darknsoft.cards.repository.CardRepository;
import ua.pp.darknsoft.cards.service.ICardService;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CardsServiceImpl implements ICardService {

    private CardRepository cardRepository;

    /**
     * @param mobileNumber - Mobile Number of the Customer
     */
    @Override
    @Transactional
    public void createCard(String mobileNumber) {
        //cardRepository.save(createNewCard(mobileNumber));
    }

    /**
     * @param mobileNumber - Mobile Number of the Customer
     * @return the new card details
     */
    private Card createNewCard(String mobileNumber) {
        return new Card();
    }

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return Card Details based on a given mobileNumber
     */
    @Override
    public CardDto fetchCard(String mobileNumber) {
        return null;
    }

    /**
     *
     * @param cardDto - CardDto DataTransferObject for Card Entity
     * @return boolean indicating if the update of card details is successful or not
     */
    @Override
    @Transactional
    public boolean updateCard(CardDto cardDto) {
        return false;
    }

    /**
     * @param mobileNumber - Input MobileNumber
     * @return boolean indicating if the delete of card details is successful or not
     */
    @Override
    @Transactional
    public boolean deleteCard(String mobileNumber) {
        return false;
    }
}
