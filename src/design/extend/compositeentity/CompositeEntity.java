package design.extend.compositeentity;

/**
 * @author huangjunyi
 * @date 2022/9/29 13:40:34
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
