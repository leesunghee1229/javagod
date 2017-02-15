package d.format;

import java.text.MessageFormat;

public class MessageFormatSample {

	public static void main(String[] args) {
		MessageFormatSample sample = new MessageFormatSample();
		sample.messageFormatSample("Min", "Camara", 3);
		sample.totalPriceMessage("Min", 120585);
	}

	public void stringSample(String customer, String product, int days) {
		String message = customer + "님 구매해 주셔서 감사합니다. \n구매하신 \"" + product + "\"는 " + days + "일내에 배송될 것입니다.\n" + "궁금하신 사항은 javatuning@gmail.com 으로 문의하시기 바랍니다.";
		System.out.println(message);
	}

	public void stringBuilderSample(String customer, String product, int days) {
		StringBuilder message = new StringBuilder();
		message.append(customer);
		message.append("님 구매해 주셔서 감사합니다. \n구매하신 \"");
		message.append(product);
		message.append("\"는 ");
		message.append(days);
		message.append("일내에 배송될 것입니다.\n");
		message.append("궁금하신 사항은 javatuning@gmail.com 으로 문의하시기 바랍니다.");
		System.out.println(message);
	}
	
	public void messageFormatSample(String customer,String product,int days) {
		String format="{0}님 구매해 주셔서 감사합니다.\n"
			+"구매하신 \"{1}\"는 {2}일내에 배송될 것입니다.\n"
			+"궁금하신 사항은 javatuning@gmail.com 으로 문의하시기 바랍니다.";
		String result=MessageFormat.format(format,customer,product,days);
		System.out.println(result);
	}

	public void totalPriceMessage(String customer, int price) {
		String format="{0}님이 구매하신 총액은 {1} 원입니다. ";
		String result=MessageFormat.format(format,customer,price);
		System.out.println(result);
	}

}
