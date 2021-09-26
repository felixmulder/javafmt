package javafmt.config;

import com.github.javaparser.ParserConfiguration.LanguageLevel;

/**
 * The supported JavaVersion
 */
public enum JavaVersion {
  /**
   * Java 11
   */
  JAVA_11(LanguageLevel.JAVA_11),
  ;

  final LanguageLevel languageLevel;

  JavaVersion(LanguageLevel languageLevel) {
    this.languageLevel = languageLevel;
  }
}
