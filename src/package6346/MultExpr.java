package package6346;

public class MultExpr implements Expr {

  private Expr expr1;
  private Expr expr2;

  public MultExpr(Expr expr1, Expr expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  @Override
  public int depth() {
    return 1 + Math.max(expr1.depth(), expr2.depth());
  }

  @Override
  public int eval() {
    return expr1.eval() * expr2.eval();
  }
}
