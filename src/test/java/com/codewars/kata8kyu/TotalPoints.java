package com.codewars.kata8kyu;

public class TotalPoints {
  public static int points(String[] games) {
    int sumPoints = 0;
    for (String match : games) {
      int score1 = Integer.parseInt(String.valueOf(match.charAt(0)));
      int score2 = Integer.parseInt(String.valueOf(match.charAt(2)));

      if (score1 > score2) sumPoints += 3; // (win)
      //if (score1 < score2)  0 points (loss) do nothing
      if (score1 == score2) sumPoints +=  1; // (tie)

    }
    return sumPoints;
  }
}
