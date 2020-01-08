package cn.xinzhi.xsxs.pojo.page;

/**
 * @author SuiXi
 * @create 2020-01-07 19:37
 */
public class Paccount extends UserInfo {
    private Integer id;
    private Integer backgrount;
    private Integer pid;
    private String certificate;
    private String intro;
    private String tx;
    private Integer userid;
    private Integer accountstatus;
    private String devicecode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBackgrount() {
        return backgrount;
    }

    public void setBackgrount(Integer backgrount) {
        this.backgrount = backgrount;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(Integer accountstatus) {
        this.accountstatus = accountstatus;
    }

    public String getDevicecode() {
        return devicecode;
    }

    public void setDevicecode(String devicecode) {
        this.devicecode = devicecode;
    }
}
