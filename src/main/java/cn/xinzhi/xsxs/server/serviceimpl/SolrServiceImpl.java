package cn.xinzhi.xsxs.server.serviceimpl;

import cn.xinzhi.xsxs.dao.SolrDao;
import cn.xinzhi.xsxs.pojo.solrpojo.dynamictype;
import cn.xinzhi.xsxs.server.ISolrService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service("solrService")
public class SolrServiceImpl implements ISolrService {
    @Autowired
    SolrDao sd;
    @Override
    public List<dynamictype> search() {

        log.info("log star");
        List<dynamictype> searchresult = sd.commit();
        return searchresult;
    }
}
