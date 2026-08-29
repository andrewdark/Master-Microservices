package ua.pp.darknsoft.cards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.pp.darknsoft.cards.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
