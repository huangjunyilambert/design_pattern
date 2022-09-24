package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:07:14
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
