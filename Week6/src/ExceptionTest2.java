import java.io.*;

public class ExceptionTest2 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("a.txt");
		int i ;
		while((i= file.read()) != -1)
			System.out.print((char)i);
		file.close();
	}
}