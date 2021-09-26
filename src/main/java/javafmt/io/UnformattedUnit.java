package javafmt.io;

import java.io.InputStream;
import java.nio.charset.Charset;

public interface UnformattedUnit {
  InputStream contents();
  Charset charset();
}
