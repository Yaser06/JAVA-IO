package com.yaser.filepath;

public class DriverMainArgs {
	
	/*Bu sekilde yaptigimizda  ArrayIndexOutOfBoundsException hatasi aliriz.
	  Amacimiz maindeki args ne ise yariyor. Onun icin Screenshoot alip ekleyecegim resmi inceleyiniz.
	  Path yapýlari bu sekilde calistirilir.Bunun denemesini ve kontrolünü yapiniz. 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		/*args sayesinde deger verme imkanimiz doguyor.Cmd ekranindan dýsaridan veri girme islemi gerceklestiriyoruz.
		 *java -classpath bin com.yaser.filepath.DriverMainArgs -l (Bu sekilde args ile  -l ifadesini göndermis olduk.Bununla
		 * belirlemis oldugumuz (-l) metodu veya tanýmlarý cagirabilme imkanýmýz olur.
		 */
		
	}

}
