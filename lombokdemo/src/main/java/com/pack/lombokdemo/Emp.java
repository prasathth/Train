package com.pack.lombokdemo;

import lombok.*;
//@Data
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode
//@AllArgsConstructor
@Value
public class Emp {
	
	final String name;
	int age;
	float salary ;
	String designation;  
	
}
