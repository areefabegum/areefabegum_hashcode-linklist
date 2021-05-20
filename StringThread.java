public class StringThread extends Thread {
	String s1;

	StringThread(String s1)
	{
		this.s1=s1;
	}
	public synchronized void run()
	{
		System.out.println(s1);
	}

}
