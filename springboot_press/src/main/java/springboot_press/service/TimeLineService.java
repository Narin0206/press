package springboot_press.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot_press.dao.TimeLineDAO;
import springboot_press.dto.Press_infoDTO;

@Service
public class TimeLineService {
	
	@Autowired
	private TimeLineDAO dao;
	
	public List<Press_infoDTO> selectAll(){
		return dao.selectAll();
	}
	

	public List<Press_infoDTO> selectOne(String from_date, String to_date, String name, String party){
		return dao.selectOne(from_date, to_date, name, party);
	}

}
