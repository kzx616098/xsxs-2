package cn.xinzhi.xsxs.server;

import cn.xinzhi.xsxs.pojo.solrpojo.dynamictype;

import java.util.List;

public interface ISolrService {
    List<dynamictype> search();
}
