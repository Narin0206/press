package springboot_press.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Speaker_listDTO {
	@Id
	private int id;
	private String date;
	private String name;
	private String party;
	private int press_id;
	private String title;

}
