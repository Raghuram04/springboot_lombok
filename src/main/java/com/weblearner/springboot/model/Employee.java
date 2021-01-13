package com.weblearner.springboot.model;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Employee {
	private String empId;
	private String empName;
	private String deptName;

}
