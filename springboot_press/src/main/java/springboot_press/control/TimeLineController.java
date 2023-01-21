package springboot_press.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springboot_press.dto.Press_infoDTO;
import springboot_press.service.TimeLineService;

@Controller
public class TimeLineController {

	@Autowired
	TimeLineService service;

	@RequestMapping("/insert")
	public String insert() {
		return "insert";
	}

	@RequestMapping("/result")
	@ResponseBody
	public List<Press_infoDTO> result(@RequestParam(value = "from_date", required = false) String from_date,
					   				  @RequestParam(value = "to_date", required = false) String to_date,
					   				  @RequestParam(value = "name", required = false) String name,
					   				  @RequestParam(value = "party", required = false) String party) {

		List<Press_infoDTO> list = service.selectOne(from_date, to_date, name, party);
		

		return list;

	}

}
