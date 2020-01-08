package cn.xinzhi.xsxs.dao;

import cn.xinzhi.xsxs.pojo.solrpojo.dynamictype;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolrDao {
    List<dynamictype> commit();
}
