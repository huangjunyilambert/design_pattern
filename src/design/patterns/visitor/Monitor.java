package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:06:35
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
