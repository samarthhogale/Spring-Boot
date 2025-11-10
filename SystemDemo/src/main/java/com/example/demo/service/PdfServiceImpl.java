package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PdfServiceImpl extends DocuementServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Fetching Data from the Pdf");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data from PDF");
		return "pdf";
	}

}
