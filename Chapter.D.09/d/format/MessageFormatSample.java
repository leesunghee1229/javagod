package d.format;

import java.text.MessageFormat;

public class MessageFormatSample {

	public static void main(String[] args) {
		MessageFormatSample sample = new MessageFormatSample();
		sample.messageFormatSample("Min", "Camara", 3);
		sample.totalPriceMessage("Min", 120585);
	}

	public void stringSample(String customer, String product, int days) {
		String message = customer + "�� ������ �ּż� �����մϴ�. \n�����Ͻ� \"" + product + "\"�� " + days + "�ϳ��� ��۵� ���Դϴ�.\n" + "�ñ��Ͻ� ������ javatuning@gmail.com ���� �����Ͻñ� �ٶ��ϴ�.";
		System.out.println(message);
	}

	public void stringBuilderSample(String customer, String product, int days) {
		StringBuilder message = new StringBuilder();
		message.append(customer);
		message.append("�� ������ �ּż� �����մϴ�. \n�����Ͻ� \"");
		message.append(product);
		message.append("\"�� ");
		message.append(days);
		message.append("�ϳ��� ��۵� ���Դϴ�.\n");
		message.append("�ñ��Ͻ� ������ javatuning@gmail.com ���� �����Ͻñ� �ٶ��ϴ�.");
		System.out.println(message);
	}
	
	public void messageFormatSample(String customer,String product,int days) {
		String format="{0}�� ������ �ּż� �����մϴ�.\n"
			+"�����Ͻ� \"{1}\"�� {2}�ϳ��� ��۵� ���Դϴ�.\n"
			+"�ñ��Ͻ� ������ javatuning@gmail.com ���� �����Ͻñ� �ٶ��ϴ�.";
		String result=MessageFormat.format(format,customer,product,days);
		System.out.println(result);
	}

	public void totalPriceMessage(String customer, int price) {
		String format="{0}���� �����Ͻ� �Ѿ��� {1} ���Դϴ�. ";
		String result=MessageFormat.format(format,customer,price);
		System.out.println(result);
	}

}
