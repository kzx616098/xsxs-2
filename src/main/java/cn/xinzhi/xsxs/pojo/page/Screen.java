package cn.xinzhi.xsxs.pojo.page;

/**
 * @author SuiXi
 * @create 2020-01-08 9:26
 */
public class Screen extends Paccount {
    private Integer sid;
    private Integer suid;
    private Integer filtercontent;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getFiltercontent() {
        return filtercontent;
    }

    public void setFiltercontent(Integer filtercontent) {
        this.filtercontent = filtercontent;
    }
}
