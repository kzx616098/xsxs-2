package cn.xinzhi.xsxs.dao;


import cn.xinzhi.xsxs.pojo.page.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SuiXi
 * @create 2019-12-30 16:18
 */
@Repository("pd")
public interface PageDao {
    List<Filtercontent> getUserListen();
    List<Filtercontent> getUserSuggest();
}
