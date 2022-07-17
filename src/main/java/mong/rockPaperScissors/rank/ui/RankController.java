package mong.rockPaperScissors.rank.ui;

import lombok.RequiredArgsConstructor;
import mong.rockPaperScissors.rank.application.RankService;
import mong.rockPaperScissors.rank.domain.Rank;
import mong.rockPaperScissors.rank.dto.RankRequest;
import mong.rockPaperScissors.rank.dto.RankResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/rank")
public class RankController {
    private final RankService rankService;

    @PostMapping()
    public void save(@RequestBody RankRequest req){
        rankService.save(req);
    }

    @GetMapping()
    public List<RankResponse> getRankList(){
        return rankService.getRankList().stream().map(rank -> new RankResponse(rank)).collect(Collectors.toList());
    }
}
