package com.yaser.filepath;

public class DriverMainArgs {
	
	/*Bu sekilde yaptigimizda  ArrayIndexOutOfBoundsException hatasi aliriz.
	  Amacimiz maindeki args ne ise yariyor. Onun icin Screenshoot alip ekleyecegim resmi inceleyiniz.
	  Path yap�lari bu sekilde calistirilir.Bunun denemesini ve kontrol�n� yapiniz. 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		/*args sayesinde deger verme imkanimiz doguyor.Cmd ekranindan d�saridan veri girme islemi gerceklestiriyoruz.
		 *java -classpath bin com.yaser.filepath.DriverMainArgs -l (Bu sekilde args ile  -l ifadesini g�ndermis olduk.Bununla
		 * belirlemis oldugumuz (-l) metodu veya tan�mlar� cagirabilme imkan�m�z olur.
		 */
		
	}

}
