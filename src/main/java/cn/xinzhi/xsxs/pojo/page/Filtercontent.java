package cn.xinzhi.xsxs.pojo.page;

/**
 * @author SuiXi
 * @create 2020-01-08 9:17
 */
public class Filtercontent extends Filtertype{
    private Integer fcid;
    private Integer filter;
    private String content;

    public Integer getFcid() {
        return fcid;
    }

    public void setFcid(Integer fcid) {
        this.fcid = fcid;
    }

    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
