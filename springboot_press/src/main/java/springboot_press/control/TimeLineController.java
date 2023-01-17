package springboot_press.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/list")
	public String list(Model model,
						@RequestParam(value = "from_date", defaultValue = "2006-04-16")String from_date,
						@RequestParam(value = "to_date", defaultValue = "20022-01-01")String to_date,
						@RequestParam(value ="name")String name,
						@RequestParam(value ="party")String party) {
		
		List<Press_infoDTO> list = service.selectAll(from_date, to_date, name, party);
		model.addAttribute("list", list);

		return "list";
		
	}
	
		
	

}
