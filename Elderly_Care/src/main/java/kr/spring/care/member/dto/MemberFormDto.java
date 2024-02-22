package kr.spring.care.member.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberFormDto {
	@NotBlank(message = "이름은 필수 항목 입니다.")
	private String name;
	
	@NotEmpty(message = "이메일은 필수 항목 입니다.")
	@Email(message = "이메일 형식이 맞지 않습니다.")
	private String email;
	
	@NotEmpty(message = "비밀번호는 필수 항목 입니다.")
	@Length(min = 4, max = 12, message = "최소 4자, 최대 12자를 입력하세요.")
	private String password;
	
	@NotEmpty(message = "주소는 필수 항목 입니다.")
	private String address;
}