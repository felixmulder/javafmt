package javafmt.config;

/**
 * Configuration primitive for the formatter
 */
public class Config {
  public final JavaVersion javaVersion;
  public final int indentation;

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private JavaVersion javaVersion = null;
    private Integer indentation = null;

    public Builder javaVersion(JavaVersion javaVersion) {
      this.javaVersion = javaVersion;
      return this;
    }

    public Builder indentation(int indentation) {
      this.indentation = indentation;
      return this;
    }

    public Config build() {
      if (javaVersion == null)
        throw new IllegalStateException("Must set java version in config");

      if (indentation == null)
        throw new IllegalStateException("Must set indentation in config");

      return new Config(javaVersion, indentation);
    }
  }

  private Config(JavaVersion javaVersion, int indentation) {
    this.javaVersion = javaVersion;
    this.indentation = indentation;
  }
}
