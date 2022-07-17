package mong.rockPaperScissors.rank.application;

import lombok.RequiredArgsConstructor;
import mong.rockPaperScissors.rank.domain.Rank;
import mong.rockPaperScissors.rank.dto.RankRequest;
import mong.rockPaperScissors.rank.infrastructure.RankJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RankService {
    private final RankJpaRepository rankJpaRepository;
    public void save (RankRequest req){
        rankJpaRepository.save(new Rank(req.getName(), req.getScore()));
    }

    public List<Rank> getRankList(){
        return rankJpaRepository.findAll();
    }
}
