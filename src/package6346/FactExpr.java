package package6346;

public class FactExpr implements Expr {

  private Expr expr;

  public FactExpr(Expr expr) {
    this.expr = expr;
  }

  @Override
  public int depth() {
    return 1 + expr.depth();
  }

  @Override
  public int eval() {
    int out = 1;
    for (int i = 1; i <= expr.eval(); i++) {
      out = out * i;
    }
    return out;
  }
}
