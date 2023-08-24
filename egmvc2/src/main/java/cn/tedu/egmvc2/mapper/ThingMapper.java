package cn.tedu.egmvc2.mapper;

import cn.tedu.egmvc2.pojo.dto.ThingDTO;
import cn.tedu.egmvc2.pojo.vo.ThingVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ThingMapper {
    void insert(ThingVO thingVO);


    ThingDTO selectThingById(int id);


    void deleteThingById(int id);

    void UpdateThingById(int id);



}
