package utils;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {

  private String email;
  private String password;
  private ArrayList<String> sendTo;
  private String attachmentPah;
  private String subject;
  private String text;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ArrayList<String> getSendTo() {
    return sendTo;
  }

  public void setSendTo(ArrayList<String> sendTo) {
    this.sendTo = sendTo;
  }

  public String getAttachmentPah() {
    return attachmentPah;
  }

  public void setAttachmentPah(String attachmentPah) {
    this.attachmentPah = attachmentPah;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void sendMail() {
    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

//    String attachmentName = null;
//
//    StringTokenizer st = new StringTokenizer(attachmentPah, "\\");
//    while (st.hasMoreTokens()) {
//      attachmentName = st.nextToken();
//    }

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(email, password);
      }
    });

    for (String receiver : sendTo) {
      try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(email));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
        message.setSubject(subject);
        message.setText(text);

//        MimeBodyPart messageBodyPart = new MimeBodyPart();
        MimeBodyPart textBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        textBodyPart = new MimeBodyPart();
        textBodyPart.setText(text);

//        messageBodyPart = new MimeBodyPart();
//        String file = attachmentPah;
//        String fileName = attachmentName;
//        DataSource source = new FileDataSource(file);
//        messageBodyPart.setDataHandler(new DataHandler(source));
//        messageBodyPart.setFileName(fileName);

        multipart.addBodyPart(textBodyPart);
//        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        System.out.println("Sending");

        Transport.send(message);

        System.out.println("Done");

      } catch (MessagingException e) {
        e.printStackTrace();
      }
    }
  }

public SendMail(String email, String password, ArrayList<String> sendTo,
		String attachmentPah, String subject, String text) {
	super();
	this.email = email;
	this.password = password;
	this.sendTo = sendTo;
	this.attachmentPah = attachmentPah;
	this.subject = subject;
	this.text = text;
}

}