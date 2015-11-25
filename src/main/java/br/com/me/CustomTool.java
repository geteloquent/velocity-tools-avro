package br.com.me;

import static org.apache.avro.Schema.Field;

/**
 * This is a simple POJO meant to be injected into Velocity context through Avro
 * Maven Plugin configuration and Avro Compiler.
 */
public class CustomTool {

  /**
   * Exemplar one line method meant to be called inside of the Velocity template.
   * It is a little dumb but imagine that we'd like to fetch the documentation
   * for a field from a remote web service or any tricky thing like that.
   */
  public String fetchDocumentationFor(Field field) {
    return field.name() + " should not be null.";
  }
}
