package ua.pp.darknsoft.loans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.pp.darknsoft.loans.entity.Loans;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {
}
