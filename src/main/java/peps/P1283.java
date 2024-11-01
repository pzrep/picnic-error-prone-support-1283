package peps;

public class P1283 {
  private final String n;

  private P1283(boolean is) {
    n = String.format("abcd " + (is ? "JS" : "ES"));
  }
}

