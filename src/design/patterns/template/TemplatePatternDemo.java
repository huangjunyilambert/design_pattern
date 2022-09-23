package design.patterns.template;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:54:50
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
