package cn.tedu.egmvc2.controller;

import cn.tedu.egmvc2.mapper.ThingMapper;
import cn.tedu.egmvc2.pojo.dto.ThingDTO;
import cn.tedu.egmvc2.pojo.vo.ThingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThingController {
    @Autowired
    private ThingMapper thingMapper;

    @RequestMapping("v1/product/insert")
    public String insertThing(String title, String price, String num) {
        ThingVO thingVO = new ThingVO();
        thingVO.setNum(num);
        thingVO.setPrice(price);
        thingVO.setTitle(title);
        thingMapper.insert(thingVO);
        return "添加成功";
    }


    @RequestMapping("v1/product/select")
    public ThingDTO selectThingById(int id, HttpServletRequest request) {
        return thingMapper.selectThingById(id);
    }

    @RequestMapping("v1/product/delete")
    public void deleteThingById(int id, HttpServletRequest request) {
        thingMapper.deleteThingById(id);
    }

    @RequestMapping("v1/product/insert")
    public String updateThingByTd(String title, String price, String num) {
        ThingVO thingVO = new ThingVO();
        thingVO.setNum(num);
        thingVO.setPrice(price);
        thingVO.setTitle(title);
        thingMapper.insert(thingVO);
        return "修改成功";
    }
}
