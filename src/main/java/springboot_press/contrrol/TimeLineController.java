package springboot_press.contrrol;

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
	
	@PostMapping("/list")
	public String list(Model model,
						@RequestParam("date")String date,
						@RequestParam("name")String name,
						@RequestParam("party")String party) {
		
		List<Press_infoDTO> list = service.selectOne(date, name, party);
		model.addAttribute("list", list);

		return "list";
		
	}
	
		
	

}
