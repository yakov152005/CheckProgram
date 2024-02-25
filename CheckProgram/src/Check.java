import javax.swing.plaf.PanelUI;

public class Check {
	private String chNumber;
	private String bName;
	private int depNumber;
	private float aMount;

	//Constructor1
	public Check(String chNumber, String bName, int depNumber, float aMount){
		this.chNumber = chNumber;
		this.bName = bName;
		this.depNumber = depNumber;
		this.aMount = aMount;
	}
	//Constructor2
	public Check(){
		this.chNumber = "UNKNOWN";
		this.bName = "UNKNOWN";
		this.depNumber =0;
		this.aMount =0.0f;
	}
	public void setData(String chNumber, String bName, int depNumber, float aMount){
		this.chNumber = chNumber;
		this.bName = bName;
		this.depNumber = depNumber;
		this.aMount = aMount;
	}
	public String getChNumber(){
		return chNumber;
	}
	public String getBName(){
		return bName;
	}
	public int getDepNumber(){
		return depNumber;
	}
	public float getaMount(){
		return aMount;
	}
	public String toString(){
		return "Bank's name: " + bName +
				"\nCheck number: " +chNumber +
				"\nBranch number: "  +depNumber +
				"\nCheck amount: " + aMount;
	}
		public void Destroy(){
		chNumber = "DESTROYED";
		bName = "DESTROYED";
		depNumber =0;
		aMount =0.0f;
	}


}
