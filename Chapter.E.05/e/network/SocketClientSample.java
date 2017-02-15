package e.network;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {

	public static void main(String[] args) {
		SocketClientSample sample = new SocketClientSample();
		sample.sendSocketSample();
	}

	public void sendSocketSample() {
		for (int loop = 0; loop < 3; loop++) {
			// sendSocketData("I liked java at "+new Date());
			sendAndReceiveSocketData("I liked java at " + new Date());
		}
		// sendSocketData("EXIT");
		sendAndReceiveSocketData("EXIT");
	}

	public void sendSocketData(String data) {
		Socket socket = null;
		try {
			System.out.println("Client:Connecting");
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client:Connect status=" + socket.isConnected());
			Thread.sleep(1000);
			OutputStream stream = socket.getOutputStream();
			BufferedOutputStream out = new BufferedOutputStream(stream);
			byte[] bytes = data.getBytes();
			out.write(bytes);
			System.out.println("Client:Sent data");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void sendAndReceiveSocketData(String data) {
		Socket socket = null;
		try {
			System.out.println("Client:Connecting");
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client:Connect status=" + socket.isConnected());
			Thread.sleep(1000);
			System.out.println("in");

			InputStream inStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
			String received = null;
			StringBuilder receivedData = new StringBuilder();
			while ((received = in.readLine()) != null) {
				receivedData.append(received);
			}
			System.out.println("Received data:" + receivedData);

			System.out.println("Client:Sent data");
			// out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
