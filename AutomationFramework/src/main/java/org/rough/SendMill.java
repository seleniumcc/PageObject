package org.rough;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;

public class SendMill {

	public static void main(String[] args) {
	
			final String username ="mukeshk25000@gmail.com"; // Add your email id here
			final String password="YourPassword";//Add your email password
			Properties prop = new Properties();
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", "587");
		
		
			Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
			
			Message msg = new MimeMessage(session);
			
			try {
			
				msg.setFrom(new InternetAddress("mukeshk25000@gmail.com"));
				// sender detail below
				msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("kevinaveryabel@gmail.com"));
				
				msg.setSubject(" This is automation test report");
				MimeMultipart multipart = new MimeMultipart();
				
				BodyPart bodypart = new MimeBodyPart();
				
			
				 bodypart.setText(" This is automation Result");
				 
				 //multipart.addBodyPart(bodypart);
				 msg.setContent(multipart);
				 /*Transport.send(msg);
				 System.out.println(" Mail Sent succsssfully..");*/
			
				// Part two is attachment
		        //messageBodyPart = new MimeBodyPart();
		         String filename = "../AutomationFramework/result/TestResult_2018_04_20_08_14_34.pdf";
		         DataSource source = new FileDataSource(filename);
		         bodypart.setDataHandler(new DataHandler(source));
		         bodypart.setFileName(filename);
		         multipart.addBodyPart(bodypart);
			
		         msg.setContent(multipart);
		         
		         Transport.send(msg);
				 System.out.println(" Mail Sent succsssfully..");
			
			
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
	}

}
