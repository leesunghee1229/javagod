package e.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

	public static void main(String[] args) {
		NioSample sample=new NioSample();
//		sample.basicWriteAndRead();	
		sample.checkBuffer();
	}
	public void basicWriteAndRead() {
		String fileName="C:\\basicjava\\text\\nio.txt";
		try {
			writeFile(fileName,"My first NIO sample.");
			readFile(fileName);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void writeFile(String fileName,String data) throws Exception{
		FileChannel channel =new FileOutputStream(fileName).getChannel();
		byte[] byteData=data.getBytes();
		ByteBuffer buffer=ByteBuffer.wrap(byteData); 
		channel.write(buffer); 
		channel.close();
	}
	public void readFile(String fileName) throws Exception {
		FileChannel channel = new FileInputStream(fileName).getChannel(); 
		ByteBuffer buffer = ByteBuffer.allocate(1024); 
		channel.read(buffer); 
		buffer.flip(); 
		while(buffer.hasRemaining()) {  
			System.out.print((char)buffer.get()); 
		}
		channel.close();
	}
	public void checkBuffer() {
		try {
			IntBuffer buffer=IntBuffer.allocate(1024);
			for(int loop=0;loop<100;loop++) {
				buffer.put(loop);
			}
			System.out.println("Buffer capacity="+buffer.capacity()); 
			System.out.println("Buffer limit   ="+buffer.limit()); 
			System.out.println("Buffer position="+buffer.position()); 
			buffer.flip(); 
			System.out.println("Buffer flipped !!!");
			System.out.println("Buffer limit   ="+buffer.limit());
			System.out.println("Buffer position="+buffer.position());
			
			System.out.println("-------------------");
			buffer.get();
			printBufferStatus("get",buffer);
			buffer.mark();
			printBufferStatus("mark",buffer);
			buffer.get();
			printBufferStatus("get",buffer);
			buffer.reset();
			printBufferStatus("reset",buffer);
			buffer.rewind();
			printBufferStatus("rewind",buffer);
			buffer.clear();
			printBufferStatus("clear",buffer);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void printBufferStatus(String job,IntBuffer buffer) {
		System.out.println("Buffer "+job+" !!!");
		System.out.format("Buffer position=%d remaining=%d limit=%d\n"
				,buffer.position(),buffer.remaining(),buffer.limit());
	}

}
