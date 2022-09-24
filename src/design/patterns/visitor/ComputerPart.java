package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:04:27
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
