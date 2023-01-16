package springboot_press.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker_listDTO {
	
	private int id;
	private String name;
	private String party;
	private int press_id;

}
