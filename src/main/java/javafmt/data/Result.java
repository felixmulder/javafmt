package javafmt.data;

import java.util.function.Consumer;
import javafmt.error.JavafmtError;

public final class Result<R> {
  private final R result;
  private final JavafmtError error;

  private Result(R result) {
    this.error = null;
    this.result = result;
  }

  private Result(JavafmtError error) {
    this.error = error;
    this.result = null;
  }

  public static <R> Result<R> of(R result) {
    return new Result<>(result);
  }

  public static <R> Result<R> error(JavafmtError error) {
    return new Result<>(error);
  }

  public boolean successful() {
    return error == null;
  }

  public void forEach(Consumer<R> func) {
    if (result != null) {
      func.accept(result);
    }
  }
}
