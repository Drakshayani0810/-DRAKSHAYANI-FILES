package org.tnsif.capgemini.c2tc.Basicsofjava;
public class ContinueDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}