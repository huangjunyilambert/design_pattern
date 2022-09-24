package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:05:58
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
