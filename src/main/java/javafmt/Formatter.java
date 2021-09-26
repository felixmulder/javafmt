package javafmt;

import javafmt.config.Config;
import javafmt.data.Result;
import javafmt.error.JavafmtError;
import javafmt.error.ParsingError;
import javafmt.io.UnformattedUnit;
import javafmt.io.FormattedUnit;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;

public class Formatter {
  public static Result<FormattedUnit> format(UnformattedUnit unit, Config config) {
    var parserConfig = new ParserConfiguration();
    var parser = new JavaParser(parserConfig);
    var ast = parser.parse(unit.contents(), unit.charset());

    return ast
      .getResult()
      .map((node) -> {
        var printer = JavafmtPrinter.of(config);
        var formattedSource = printer.print(node);
        return Result.of(FormattedUnit.of(formattedSource));
      })
      .orElseGet(() -> {
        var error = new ParsingError("Parsing failed: " + ast.toString());
        return Result.error(error);
      });
  }
}
