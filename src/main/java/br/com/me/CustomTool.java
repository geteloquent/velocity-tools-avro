package br.com.me;

import static org.apache.avro.Schema.Field;

public class CustomTool {
  public String CustomTool(Field field) {
    return field.name() + " should not be null.";
  }
}
