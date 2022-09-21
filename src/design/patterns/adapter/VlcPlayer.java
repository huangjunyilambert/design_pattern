package design.patterns.adapter;

/**
 * @author huangjunyi
 * @date 2022/9/21 19:21:37
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
