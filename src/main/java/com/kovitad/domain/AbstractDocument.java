package com.kovitad.domain;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;

public class AbstractDocument {
	
	@Id
	private BigInteger id;
	
}
