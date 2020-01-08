package cn.xinzhi.xsxs.controller;


import cn.xinzhi.xsxs.pojo.page.Filtercontent;
import cn.xinzhi.xsxs.server.IPageService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author SuiXi
 * @create 2019-12-30 16:43
 */
@Log4j2
@RestController
@Api("查询所有用户信息并且分页")
@RequestMapping("/page")
public class PageAllController {

    @Qualifier("psi")
    @Autowired
    private IPageService pageService;

    @GetMapping("/shouye/listen")
    @CrossOrigin
    @ApiOperation(value = "倾听分页")
    public PageInfo<Filtercontent> getUserListen(){
        PageInfo<Filtercontent> user = pageService.getUserListen(1,4);
        log.info(user);
        return user;
    }
    @GetMapping("/shouye/suggest")
    @CrossOrigin
    @ApiOperation(value = "建议分页")
    public PageInfo<Filtercontent> getUserSuggest(){
        PageInfo<Filtercontent> suggest = pageService.getUserSuggest(1,4);
        return suggest;
    }
}
