package javafmt.io;

import java.io.InputStream;
import java.nio.charset.Charset;

public class FormattedUnit {
  private String contents;

  public String contents() {
    return this.contents;
  }

  public static FormattedUnit of(String contents) {
    return new FormattedUnit(contents);
  }

  private FormattedUnit(String contents) {
    this.contents = contents;
  }
}
