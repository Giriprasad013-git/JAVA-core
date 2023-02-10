class Bag
{
	private String Bagbrand;
	private String color;
	private String Noofcompartments;
	private long price;
	Bag(){}
	Bag(String Bagbrand,String color,String Noofcompartments,long price)
	{
		this.Bagbrand=Bagbrand;
		this.color=color;
		this.Noofcompartments=Noofcompartments;
		this.price=price;
	}
	public String getBrand()
	{
		return Bagbrand;
	}
}
