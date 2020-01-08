package cn.xinzhi.xsxs.server;

import cn.xinzhi.xsxs.pojo.page.Filtercontent;
import com.github.pagehelper.PageInfo;

/**
 * @author SuiXi
 * @create 2019-12-30 16:30
 */
public interface IPageService {
    PageInfo<Filtercontent> getUserListen(int pageNo, int pageSize);
    PageInfo<Filtercontent> getUserSuggest(int pageNum, int pageSize);
}
