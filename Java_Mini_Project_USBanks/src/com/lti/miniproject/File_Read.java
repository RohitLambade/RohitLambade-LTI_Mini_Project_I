package com.lti.miniproject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class File_Read {
	HashMap <String, Complaint_Details_Bank_UI> MapBankobjcompdet = new HashMap<>();
	public void fileLoader()
	{

		String path="E:\\USBank_Data\\LTI_MiniProject_data_I\\complaints.csv";
		String line="";

		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(path));
			while ((line=bf.readLine())!=null)
			{   

				String[] elements=line.split(",");
				Complaint_Details_Bank_UI objcompdet=new Complaint_Details_Bank_UI();
				objcompdet.dateReceived=elements[0];
				objcompdet.product=elements[1];
				objcompdet.subProduct=elements[2];
				objcompdet.issue=elements[3];
				objcompdet.subIssue=elements[4];
				objcompdet.company=elements[5];
				objcompdet.state=elements[6];
				objcompdet.ZIPcode=elements[7];
				objcompdet.submittedVia=elements[8];
				objcompdet.dateSentToCompany=elements[9];
				objcompdet.companyResponseToConsumer=elements[10];
				objcompdet.timelyResponse=elements[11];
				objcompdet.consumerDisputed=elements[12];
				objcompdet.consumerDisputed=elements[12];

				MapBankobjcompdet.put(elements[13],objcompdet); 
			}
			bf.close();

		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	HashMap<String,Complaint_Details_Bank_UI> GetMapBankobjcompdet()
	
	{

		return MapBankobjcompdet;

	}
}