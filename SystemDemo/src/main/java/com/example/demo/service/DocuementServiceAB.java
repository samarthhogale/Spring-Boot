package com.example.demo.service;

public abstract class DocuementServiceAB  implements DocuementService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading Data from DB");
	}

//	@Override
//	public void processData() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String printData() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String PrintInvoice() {
		// TODO Auto-generated method stub
		readData();
		processData();
		return printData();
	}

}
