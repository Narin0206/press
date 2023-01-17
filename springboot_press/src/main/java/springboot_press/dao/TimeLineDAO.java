package springboot_press.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import springboot_press.dto.Press_infoDTO;

@Repository
@Mapper
public interface TimeLineDAO {

	List<Press_infoDTO> selectAll(String from_date, String to_date, String name, String party);
}
