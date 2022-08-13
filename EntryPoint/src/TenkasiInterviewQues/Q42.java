package TenkasiInterviewQues;

public class Q42 {

	public static void main(String[] args) {
				new Q42().convertArray();
			}

			private void convertArray() {
				int arr[]= {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
				for(int i=0;i<arr.length;i++)
				{
					if(i+1>arr.length-1)
						break;
					if(arr[i]==0)
						continue;
					else
						if(arr[i+1]==arr[i]&&arr[i+1]!=0)
						{
							arr[i]=arr[i]*2;
							arr[i+1]=0;
						}
				}
				displayArray(arr);
				System.out.println();
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==0)
						continue;
					for(int j=i;j>0;j--)
					{
						if(arr[j-1]==0)
						{
							int temp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=temp;
							
						}
						else
							break;
						
					}
				}
			
			displayArray(arr);
		}
		public void displayArray(int arr[])

		{
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		}

}
