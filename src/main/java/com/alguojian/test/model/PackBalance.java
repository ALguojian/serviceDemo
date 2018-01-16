package com.alguojian.test.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class PackBalance implements Serializable {

	private static final long serialVersionUID = 6054769862207004447L;

	private String userId;

	private double balance;
}
