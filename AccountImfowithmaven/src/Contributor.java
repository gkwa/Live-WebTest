
public class Contributer extends PageObject{
	
	//public PageObject obj =new PageObject();
	public PageObject obj;
	
	public Contributer(){
		
		obj=new PageObject();
		//this.obj=null;
	}
	
	
	void contributerun() throws InterruptedException{
		
		try{
		
		obj.SetWebSite("http://d2.streambox.com/ls/SLSLogin.php");
		obj.Login("hiro1contributer","demo");
		obj.run();
		}catch(Exception e){
			
			System.out.println("Contributer Error");
			
		}
		
		
		
	}
	
	

}
