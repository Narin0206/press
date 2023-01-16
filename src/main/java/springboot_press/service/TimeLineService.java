package springboot_press.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot_press.dao.TimeLineDAO;
import springboot_press.dto.Press_infoDTO;

@Service
public class TimeLineService {
	
	private TimeLineDAO dao;
	
	public List<Press_infoDTO> selectAll(){
		return dao.selectAll();
	}
	
	public List<Press_infoDTO> selectOne(String date, String name, String party){
		return dao.selectOne(date, name, party);
	}

}
