package ua.pp.darknsoft.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.pp.darknsoft.accounts.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
}
