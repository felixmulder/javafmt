package javafmt;

import com.github.javaparser.ast.Node;
import com.github.javaparser.printer.configuration.PrinterConfiguration;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;
import com.github.javaparser.printer.Printer;

import javafmt.config.Config;

public class JavafmtPrinter implements Printer {
  private PrinterConfiguration configuration;

  private JavafmtPrinter(Config config) {
    this.configuration = new DefaultPrinterConfiguration();
  }

  public static JavafmtPrinter of(Config config) {
    return new JavafmtPrinter(config);
  }

  @Override
  public String print(Node node) {
    return "<NOT IMPLEMENTED>";
  }

  @Override
  public Printer setConfiguration(PrinterConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

  @Override
  public PrinterConfiguration getConfiguration() {
    return this.configuration;
  }

}
