package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl extends DocuementServiceAB {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Fetching data from the Excel");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data From Excel");
		return "excel";
	}

}
