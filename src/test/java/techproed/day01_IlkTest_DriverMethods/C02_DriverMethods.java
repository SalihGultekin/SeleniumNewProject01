package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");

        //getTitle() methodu Sayfa Başlığını verir
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println(" Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("TTechproed Actual Title : "+driver.getTitle());//Sayfa Başlığını verir

        //getCurrentUrl () methodu Gidilen sayfanın Url'ini verir
        System.out.println(" Techproed Actual Url : "+driver.getCurrentUrl());

        //GetPAgeSource() methodu Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource()); ==> Bilerek yoruma aldık., her çalıştırmada bu çalışmasın diye.

        //getWindowHandle () methodu Gidilen sayfanın handle değerini (hashCode) verir,bu handle değerini sayfalar arası
        //geçiş için kullanırız.
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());


    }
}
