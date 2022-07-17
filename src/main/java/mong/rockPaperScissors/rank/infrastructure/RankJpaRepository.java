package mong.rockPaperScissors.rank.infrastructure;

import mong.rockPaperScissors.rank.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankJpaRepository extends JpaRepository<Rank, Long> {
}
