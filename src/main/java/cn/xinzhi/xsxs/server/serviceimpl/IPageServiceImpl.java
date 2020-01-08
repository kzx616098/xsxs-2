package cn.xinzhi.xsxs.server.serviceimpl;

import cn.xinzhi.xsxs.dao.PageDao;
import cn.xinzhi.xsxs.pojo.page.Filtercontent;
import cn.xinzhi.xsxs.server.IPageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SuiXi
 * @create 2019-12-30 16:31
 */
@Log4j2
@Service("psi")
public class IPageServiceImpl implements IPageService {
    @Autowired
    @Qualifier("pd")
    private PageDao pageDao;

    @Override
    public PageInfo<Filtercontent> getUserListen(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Filtercontent> user = pageDao.getUserListen();
        PageInfo<Filtercontent> page = new PageInfo<Filtercontent>(user);
        return page;
    }

    @Override
    public PageInfo<Filtercontent> getUserSuggest(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Filtercontent> userSuggest = pageDao.getUserSuggest();
        PageInfo<Filtercontent> pageInfo = new PageInfo<Filtercontent>(userSuggest);
        return pageInfo;
    }
}
