package mong.rockPaperScissors.rank.dto;

import lombok.Getter;
import mong.rockPaperScissors.rank.domain.Rank;

import java.time.LocalDateTime;

@Getter
public class RankResponse {
    private Long id;
    private String name;
    private Long score;
    private LocalDateTime playTime;

    public RankResponse(Rank rank) {
        this.id = rank.getId();
        this.name = rank.getName();
        this.score = rank.getScore();
        this.playTime = rank.getCreatedDate();
    }
}
