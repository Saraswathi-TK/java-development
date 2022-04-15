class CameraRunner
{
	public static void main(String[] args)
	{
		CameraSeller seller=new CameraSeller();
		seller.sell(30);
		String it="lens";
		seller.sell(it);
		String brand="lg";
		Camera camera=new Camera(brand,45000);
		seller.sell(camera);
		System.out.println(camera.brand);
		System.out.println(camera.price);
		
		SonyCamera camera1=new SonyCamera("Sony",40000,"S-45");
		seller.sell(camera1);
		
		NikonCamera camera2=new NikonCamera("Nikon",50000);
		seller.sell(camera2);
	}
}