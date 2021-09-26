package javafmt.error;

public class ParsingError implements JavafmtError {
  private final String reason;

  public ParsingError(String reason) {
    this.reason = reason;
  }
}
