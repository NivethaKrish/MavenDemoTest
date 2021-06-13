package CapitalPay;

public class FDScheme {
	
	private int schemeNo;
	private double depositAmt;
	private int period;
	private float rate;
	
	public int getSchemeNo() {
		return schemeNo;
	}
	public void setSchemeNo(int schemeNo) {
		this.schemeNo = schemeNo;
	}
	public double getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(double depositAmt) {
		this.depositAmt = depositAmt;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public FDScheme(int schemeNo,double depositAmt,int period)
	{
		this.schemeNo = schemeNo;
		this.depositAmt = depositAmt;
		this.period = period;
		
	}
	
	
	
	public void calculateInterestRate()
	{
		
		if(period>=1 && period<=90)
		{	
			rate=(float) 5.5;
			setRate(rate);
		
		}
		
		else if(period>=91 && period<=180)
		{
			rate = (float) 6.5;
			setRate(rate);
		}
		
		else if(period>=181 && period<=365)
		{
			rate = (float) 7.5;
			setRate(rate);
		}
	}

}
