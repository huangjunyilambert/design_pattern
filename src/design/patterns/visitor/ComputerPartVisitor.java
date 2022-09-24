package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:05:32
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
