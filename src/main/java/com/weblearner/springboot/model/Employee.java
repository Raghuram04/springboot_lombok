package com.weblearner.springboot.model;


import java.io.Serializable;

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
public class Employee implements Serializable{
	private String empId;
	private String empName;
	private String deptName;

}
