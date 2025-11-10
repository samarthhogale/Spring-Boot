package com.example.demo.service;

public class PDFserviceImpl implements DocuementService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Read");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("fetching");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("printing");
		return "pdf";
	}

}
