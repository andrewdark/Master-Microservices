package ua.pp.darknsoft.accounts.repository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import ua.pp.darknsoft.accounts.entity.Accounts;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    void deleteByCustomerId(Long customerId);
}
