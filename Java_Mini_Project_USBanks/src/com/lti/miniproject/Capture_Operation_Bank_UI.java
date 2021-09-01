package com.lti.miniproject;
import java.util.HashMap;
import java.util.Scanner;

public class Capture_Operation_Bank_UI {
	File_Read bankfileR= new File_Read();
	Scanner sc=new Scanner(System.in);

	void loadData()
	{
		bankfileR.fileLoader();
	}

	void complaintsBasedOnYear(String year)
	{
		for (HashMap.Entry<String,Complaint_Details_Bank_UI> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(entry.getValue().dateReceived.contains(year))
			{ 
				System.out.println(entry.getValue().issue);
			}
		}

	}

	void complaintsBasedOnCompany(String u_company)
	{
		for (HashMap.Entry<String,Complaint_Details_Bank_UI> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(entry.getValue().company.equalsIgnoreCase(u_company))
			{
				System.out.println(entry.getValue().issue + " "+ u_company);
			}
		}
	}

	void complaintsBasedOnComplaintID(String id)
	{
		
		for (HashMap.Entry<String,Complaint_Details_Bank_UI> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(bankfileR.GetMapBankobjcompdet().containsKey(id))
			{
				System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
			}
		}
	}


	void complaintsClosed()
	{
		for (HashMap.Entry<String,Complaint_Details_Bank_UI> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			String compResp=entry.getValue().companyResponseToConsumer;

			if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
			{
				System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
			}
		}

	}


	void complaintsReceivingTimelyResponse()
	{
		for (HashMap.Entry<String,Complaint_Details_Bank_UI> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(entry.getValue().timelyResponse.equals("Yes"))
			{
				System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
			}
		}
	}

	public Capture_Operation_Bank_UI(){
		super();
	}
}
