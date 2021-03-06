package grammar.Absyn; // Java Package generated by the BNF Converter.

public class Automaton extends AutomatonRule {
  public final AutomataInitRule automatainitrule_;
  public final ListAutomataTransitionRule listautomatatransitionrule_;
  public final AutomataAcceptingsRule automataacceptingsrule_;
  public Automaton(AutomataInitRule p1, ListAutomataTransitionRule p2, AutomataAcceptingsRule p3) { automatainitrule_ = p1; listautomatatransitionrule_ = p2; automataacceptingsrule_ = p3; }

  public <R,A> R accept(grammar.Absyn.AutomatonRule.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof grammar.Absyn.Automaton) {
      grammar.Absyn.Automaton x = (grammar.Absyn.Automaton)o;
      return this.automatainitrule_.equals(x.automatainitrule_) && this.listautomatatransitionrule_.equals(x.listautomatatransitionrule_) && this.automataacceptingsrule_.equals(x.automataacceptingsrule_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.automatainitrule_.hashCode())+this.listautomatatransitionrule_.hashCode())+this.automataacceptingsrule_.hashCode();
  }


}
