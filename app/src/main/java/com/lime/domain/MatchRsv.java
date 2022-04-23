package com.lime.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MatchRsv {
  Integer matchId;
  int userId;
  int limeId;
  String state;
  Match match;
  String date;

  public MatchRsv() {}

  public MatchRsv(Integer matchId, int userId, String state) {
    this.matchId = matchId;
    this.userId = userId;
    this.state = state;
  }

  public MatchRsv(Integer matchId, int userId, int limeId, String state) {
    this(matchId, userId, state);
    this.limeId = limeId;
  }

  //  public MatchRsv(Integer matchId, int userId, int limeId, String state, Match match, LimeCash limeCash) {
  //    this(matchId, userId, limeId, state);
  //    this.match = match;
  //    this.limeCash = limeCash;
  //  }

  public MatchRsv(MatchRsv matchRsv) {
    this.matchId = matchRsv.getMatchId();
    this.userId = matchRsv.userId;
    this.state = matchRsv.state;
  }
}