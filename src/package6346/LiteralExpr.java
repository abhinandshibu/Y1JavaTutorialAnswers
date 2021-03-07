package package6346;

public class LiteralExpr implements Expr {

  private int value;

  public LiteralExpr(int value) {
    this.value = value;
  }

  public int depth() {
    return 0;
  }

  @Override
  public int eval() {
    return value;
  }
}
