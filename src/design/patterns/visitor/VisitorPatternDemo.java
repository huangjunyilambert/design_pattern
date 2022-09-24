package design.patterns.visitor;

/**
 * @author huangjunyi
 * @date 2022/9/24 19:15:22
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
