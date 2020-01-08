package cn.xinzhi.xsxs.pojo.page;

/**
 * @author SuiXi
 * @create 2019-12-30 17:12
 */
public class Picture{
    private Integer piid;
    private String img;
    private String background;

    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + piid +
                ", img='" + img + '\'' +
                ", background='" + background + '\'' +
                '}';
    }
}
