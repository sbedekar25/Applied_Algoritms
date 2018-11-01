import java.util.Arrays;
import java.util.Vector;

public class Midas {

	public static void main(String[] args) {

		int arr[]={30,20,25,20,5,5,30,15,8,26};		
		Vector stops=new Vector();
		Vector s=new Vector();
		int j=0;
		int m_w=0;
		int d=30;
		for(int i=0;i<arr.length;i++)
		{		
			if(m_w<=d)
			{		
				m_w=m_w+arr[i];
				if(m_w<d && i!=arr.length-1 && (m_w+arr[i+1])>d)
				{
					s.addElement(String.valueOf(m_w));
					stops.addElement(String.valueOf(i+2));
					System.out.println(m_w+" 1 "+(i+2));
					j=j+1;
					m_w=0;					
				}
				else if(m_w<d && i==arr.length-1)
				{
					s.addElement(String.valueOf(m_w));
					stops.addElement(String.valueOf(i+2));
					System.out.println(m_w+" 2 "+(i+2));
					j=j+1;
					m_w=0;
				}
				
				else if(m_w>d)
				{
					m_w=m_w-arr[i];
					s.addElement(String.valueOf(m_w));
					stops.addElement(String.valueOf(i+1));
					System.out.println(m_w+" 3 "+(i+1));
					j=j+1;
					m_w=0;
					
				}
				else if(m_w==d)
				{
					s.addElement(String.valueOf(m_w));
					stops.addElement(String.valueOf(i+2));
					System.out.println(m_w+" 4 "+(i+2));

					j=j+1;
					m_w=0;					
				}
			}				
		}
				System.out.println(s);
				System.out.println(stops);

	}

}
