package javafmt.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class UnformattedStringUnit implements UnformattedUnit {
  private final String contents;

  public static UnformattedStringUnit of(String contents) {
    return new UnformattedStringUnit(contents);
  }

  private UnformattedStringUnit(String contents) {
    this.contents = contents;
  }

  @Override
  public InputStream contents() {
    return new ByteArrayInputStream(contents.getBytes());
  }

  @Override
  public Charset charset() {
    return StandardCharsets.UTF_8;
  }

}
