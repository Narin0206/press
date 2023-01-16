package springboot_press.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Press_infoDTO {
	
	private int id;
	private String date;
	private String time;
	private String title;

}
